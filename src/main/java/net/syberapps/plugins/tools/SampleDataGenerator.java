package net.syberapps.plugins.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.maven.project.MavenProject;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.LoadFile;
import org.apache.tools.ant.taskdefs.Replace;
import org.apache.tools.ant.taskdefs.optional.ReplaceRegExp;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import net.syberapps.plugins.pojo.ValueExampleObject;

public class SampleDataGenerator {
	
    private Log log;
    static final String FILE_SEP = System.getProperty("file.separator");
    Project antProject;
    String pojoName;
    String pojoNameLower;
    String destinationDirectory;
    String sourceDirectory;
    MavenProject project;
    boolean genericCore;
    StringUtils util;
	
	
    
    public SampleDataGenerator(MavenProject project, String pojoName, String sourceDirectory, String destinationDirectory, boolean genericCore) {
        this.project = project;
        this.pojoName = pojoName;
        this.pojoNameLower = pojoLowerCase(pojoName);
        this.sourceDirectory = sourceDirectory;
        this.destinationDirectory = destinationDirectory;
        this.genericCore = genericCore;
        this.util = new StringUtils();
    }
	
	public void doStuff() throws IOException, TemplateException {
    // 1. Configure FreeMarker
    //
    // You should do this ONLY ONCE, when your application starts,
    // then reuse the same Configuration object elsewhere.

    Configuration cfg = new Configuration();

    // Where do we load the templates from:
    cfg.setClassForTemplateLoading(SampleDataGenerator.class, "templates");

    // Some other recommended settings:
    //cfg.setIncompatibleImprovements(new Version(2, 3, 20)); // Doesn't exist in this version of ftl.
    cfg.setDefaultEncoding("UTF-8");
    cfg.setLocale(Locale.US);
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

    // 2. Proccess template(s)
    //
    // You will do this for several times in typical applications.

    // 2.1. Prepare the template input:

    Map<String, Object> input = new HashMap<String, Object>();

    input.put("title", "Vogella example");

    input.put("exampleObject", new ValueExampleObject("Java object", "me"));

    List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
    systems.add(new ValueExampleObject("Android", "Google"));
    systems.add(new ValueExampleObject("iOS States", "Apple"));
    systems.add(new ValueExampleObject("Ubuntu", "Canonical"));
    systems.add(new ValueExampleObject("Windows7", "Microsoft"));
    input.put("systems", systems);

    // 2.2. Get the template

    Template template = cfg.getTemplate("helloworld.ftl");

    // 2.3. Generate the output

    // Write output to the console
    Writer consoleWriter = new OutputStreamWriter(System.out);
    template.process(input, consoleWriter);

    // For the sake of example, also write output into a file:
    Writer fileWriter = new FileWriter(new File("output.html"));
    try {
        template.process(input, fileWriter);
    } finally {
        fileWriter.close();
    }

}
	
	//https://github.com/appfuse/appfuse/blob/3f4588dce74b7f0762bec65727731bc3bf6ae899/plugins/appfuse-maven-plugin/src/main/java/org/appfuse/tool/ArtifactInstaller.java
	
    /**
     * Add sample-data.xml to project's sample-data.xml
     */
    private void installSampleData() {
        createLoadFileTask("src/test/resources/" + pojoName + "-sample-data.xml", "sample.data").execute();
        File existingFile = new File(destinationDirectory + "/src/test/resources/sample-data.xml");

        parseXMLFile(existingFile, null, "</dataset>", "sample.data");
    }
    
    private String pojoLowerCase(String name) {
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
	
    private void parseXMLFile(File existingFile, String beanName, String tokenToReplace, String fileVariable) {
        String nameInComment = beanName;
        if (beanName == null) {
            nameInComment = pojoName;
        }
        Replace replace1 = (Replace) antProject.createTask("replace");
        replace1.setFile(existingFile);
        replace1.setToken("<!--" + nameInComment + "-START-->");
        replace1.setValue("REGULAR-START");
        replace1.execute();

        Replace replace2 = (Replace) antProject.createTask("replace");
        replace2.setFile(existingFile);
        replace2.setToken("<!--" + nameInComment + "-END-->");
        replace2.setValue("REGULAR-END");
        replace2.execute();

        ReplaceRegExp regExpTask = (ReplaceRegExp) antProject.createTask("replaceregexp");
        regExpTask.setFile(existingFile);
        regExpTask.setMatch("REGULAR-START(?s:.)*REGULAR-END");
        regExpTask.setReplace("");
        regExpTask.setFlags("g");
        regExpTask.execute();

        Replace replaceData = (Replace) antProject.createTask("replace");
        replaceData.setFile(existingFile);
        replaceData.setToken(tokenToReplace);
        String stringWithProperLineEndings = adjustLineEndingsForOS(antProject.getProperty(fileVariable));
        replaceData.setValue(stringWithProperLineEndings);
        replaceData.execute();
    }
    
    private static String adjustLineEndingsForOS(String property) {
        String os = System.getProperty("os.name");

        if (os.startsWith("Linux") || os.startsWith("Mac")) {
            // remove the \r returns
            property = property.replaceAll("\r", "");
        } else if (os.startsWith("Windows")) {
            // use windows line endings
            property = property.replaceAll(">\n", ">\r\n");
        }

        return property;
    }

    /**
     * This method will create an ANT based LoadFile task based on an infile and a property name.
     * The property will be loaded with the infile for use later by the Replace task.
     *
     * @param inFile   The file to process
     * @param propName the name to assign it to
     * @return The ANT LoadFile task that loads a property with a file
     */
    protected LoadFile createLoadFileTask(String inFile, String propName) {
        inFile = sourceDirectory + FILE_SEP + inFile;
        LoadFile loadFileTask = (LoadFile) antProject.createTask("loadfile");
        loadFileTask.init();
        loadFileTask.setProperty(propName);
        loadFileTask.setSrcFile(new File(inFile));

        return loadFileTask;
    }
	

}
