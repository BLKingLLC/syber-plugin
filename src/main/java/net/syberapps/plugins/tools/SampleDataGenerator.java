package net.syberapps.plugins.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.LoadFile;
import org.apache.tools.ant.taskdefs.Replace;
import org.apache.tools.ant.taskdefs.optional.ReplaceRegExp;
import org.hibernate.MappingException;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.tool.hbm2x.Cfg2JavaTool;
import org.hibernate.tool.hbm2x.GenericExporter;
import org.hibernate.tool.hbm2x.pojo.POJOClass;


import net.syberapps.plugins.tools.InlineCompiler;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class SampleDataGenerator extends GenericExporter {

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
	boolean configured = false;

	public SampleDataGenerator() {
	}
	
	public boolean isConfigured() {
		return configured;
	}
	public void configured() {
		configured = true;
	}

	public SampleDataGenerator(MavenProject project, String pojoName, String sourceDirectory,
			String destinationDirectory, Project antProject) throws MojoExecutionException {
		this.project = project;
		this.pojoName = pojoName;
		this.pojoNameLower = pojoLowerCase(pojoName);
		this.sourceDirectory = sourceDirectory;
		this.destinationDirectory = destinationDirectory;
		this.antProject = antProject;
		this.util = new StringUtils();
	}

	public void setPojoName(String name) {
		this.pojoName = name;
	}

	public void doStuff() throws IOException, TemplateException {

		// 1. Configure FreeMarker
		//
		// You should do this ONLY ONCE, when your application starts,
		// then reuse the same Configuration object elsewhere.

		Configuration cfg = new Configuration();

		// Where do we load the templates from:
		cfg.setClassForTemplateLoading(SampleDataGenerator.class, "/");

		// Some other recommended settings:
		// cfg.setIncompatibleImprovements(new Version(2, 3, 20)); // Doesn't exist in
		// this version of ftl.
		cfg.setDefaultEncoding("UTF-8");
		cfg.setLocale(Locale.US);
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		installSampleData();

	}

	// https://github.com/appfuse/appfuse/blob/3f4588dce74b7f0762bec65727731bc3bf6ae899/plugins/appfuse-maven-plugin/src/main/java/org/appfuse/tool/ArtifactInstaller.java

	/**
	 * Add sample-data.xml to project's sample-data.xml
	 */
	private void installSampleData() {

		// generate sample-data.xml
		//why am I doing this twice
		/*if(configured) {
			exporter = this;
		}
	
		GenericExporter exporter = configureExporter("appfuse/dao/sample-data.ftl",
				"src/test/resources/{class-name}-sample-data.xml");
		
		
		org.hibernate.cfg.Configuration thing = exporter.getConfiguration();
		if(thing == null) {
			System.out.println("******************************************NULL FUCKER*****************");
		}*/
		
		if(configured) {
			configureExporter("appfuse/dao/sample-data.ftl",
					"src/test/resources/{class-name}-sample-data.xml");
			//Iterator iterator = ge.getCfg2JavaTool().getPOJOIterator(ge.getConfiguration().getClassMappings());
			Cfg2JavaTool javaTool = getCfg2JavaTool();
			
			
			
			org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration()
					.addResource("hibernate.cfg.xml");
			SessionFactory factory = config
					.buildSessionFactory();
			setConfiguration(config);
			
			System.out.println("Added config to config.");
			
			Iterator mapp = config.getClassMappings();
			for (Iterator<PersistentClass> it = mapp; it.hasNext();) {
				PersistentClass cl = it.next();
				System.out.println("persistent class is :: " + cl.getClassName());
			}
			
			
			/*Properties thing = exporter.getProperties();
			Configuration thatThing = exporter.getConfiguration();
			Iterator otherThing = exporter.getConfiguration().getCollectionMappings();
			for (Iterator<Configuration> it = otherThing; it.hasNext();) {
				Configuration thang = it.next();
				System.out.println("THANG IS ::::::::::::::::::::: " + thang.toString());
				
			}*/
			
			
			
			//javaTool.getPOJOIterator(persistentClasses)
			
		start();
		} else {
			System.out.println("NOT CONFIGURED !!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		

		String inFile = "src/test/resources/" + pojoName + "-sample-data.xml";
		System.out.print("Infile is :: " + inFile);
		LoadFile loadfile = createLoadFileTask(inFile, "sample.data");

		loadfile.execute();

		System.out.println("Destination Directory is :: " + destinationDirectory);
		File existingFile = new File(destinationDirectory + "/sample-data.xml");
		/*
		 * try { writeFile(destinationDirectory + "/sample-data.xml"); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println("ExistingFile is ::" + existingFile);

		parseXMLFile(existingFile, null, "</dataset>", "sample.data");
	}

	private String pojoLowerCase(String name) {
		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}

	private void parseXMLFile(File existingFile, String beanName, String tokenToReplace, String fileVariable) {
		System.out.println("Existing File is :: " + existingFile.getAbsolutePath());
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
			try {
				property = property.replaceAll("\r", "");
			} catch (Exception e) {
			}
		} else if (os.startsWith("Windows")) {
			// use windows line endings
			property = property.replaceAll(">\n", ">\r\n");
		}

		return property;
	}

	/**
	 * This method will create an ANT based LoadFile task based on an infile and a
	 * property name. The property will be loaded with the infile for use later by
	 * the Replace task.
	 *
	 * @param inFile
	 *            The file to process
	 * @param propName
	 *            the name to assign it to
	 * @return The ANT LoadFile task that loads a property with a file
	 */
	protected LoadFile createLoadFileTask(String inFile, String propName) {
		System.out.println("\nSetting up the sample data generator to write to " + inFile);

		//inFile = sourceDirectory + FILE_SEP + inFile;
		try {
			writeFile(inFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadFile loadFileTask = (LoadFile) antProject.createTask("loadfile");
		loadFileTask.init();
		loadFileTask.setProperty(propName);
		File newFile = new File(inFile);
		System.out.println("New File Path :: " + newFile.getAbsolutePath());
		System.out.println("New path is :: " + newFile.getPath());
		loadFileTask.setSrcFile(newFile);

		return loadFileTask;
	}

	private void writeFile(String file) throws IOException {
		System.out.println("Writing to " + file);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("");
	}

	private GenericExporter configureExporter(String template, String pattern) {
		System.out.println("Configurating exporter");
		// Add custom template path if specified
		String[] templatePaths;
		String td = getProperties().getProperty("templatedirectory");
		System.out.println(td);
		if (getProperties().getProperty("templatedirectory") != null) {
			System.out.println("templatedirectory was not null.");
			templatePaths = new String[getTemplatePaths().length + 1];
			templatePaths[0] = getProperties().getProperty("templatedirectory");
			if (getTemplatePaths().length > 1) {
				for (int i = 1; i < getTemplatePaths().length; i++) {
					templatePaths[i] = getTemplatePaths()[i - 1];
				}
			}
		} else {
			templatePaths = getTemplatePaths();
		}
		String size = new Integer(templatePaths.length).toString();

		System.out.println("Size of templatepaths array :: " + size);

		for (String templatePath : templatePaths) {

			System.out.println("Template path is :: " + templatePath);
		}

		System.out.println("Config :: " + getConfiguration());
		System.out.println("Output Directory" + getOutputDirectory());

		org.hibernate.cfg.Configuration config = getConfiguration();
		//org.hibernate.cfg.Configuration configs = new org.hibernate.cfg.Configuration();

		
		String str ="annotationconfiguration.PurplePerson";
	    Class<?> clazz = null;
		try {
			clazz = getClass().getClassLoader().loadClass(str);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			if(config == null) {
				//throw new NullPointerException("Config is still null.");
				ClassLoader classLoader = getClass().getClassLoader();
				URL configPath = classLoader.getResource("annotationconfiguration/hibernate.cfg.xml");
				URL checker = classLoader.getResource("jdbcconfiguration/hibernate.cfg.xml");
				if(checker == null) {
					throw new NullPointerException("Fucken checker is null.");
				}
				
				if(configPath == null) {
					throw new NullPointerException("Mother Fucker is null.");
				}
				
				config = new org.hibernate.cfg.Configuration()
						.addResource("hibernate.cfg.xml")
						.addResource("jdbcconfiguration/hibernate.cfg.xml");
				
				SessionFactory factory = config
						.buildSessionFactory();
				setConfiguration(config);
				
				System.out.println("Added config to config.");
				if(config == null) {
					throw new NullPointerException("Shit balls.");
				}
			}
			
			config.addClass(clazz);
		} catch (MappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		GenericExporter exporter = new GenericExporter(getConfiguration(), getOutputDirectory()) {
			@Override
			protected void exportPOJO(Map map, POJOClass element) {
				if (element.getShortName().equals(System.getProperty("appfuse.entity"))) {
					super.exportPOJO(map, element);
				}
			}

			@Override
			protected String resolveFilename(POJOClass element) {
				String filename = super.resolveFilename(element);
				String packageLocation = getPackageNameForFile(element).replace(".", "/");

				String pojoName = System.getProperty("entity");
				if (pojoName == null) {
					pojoName = System.getProperty("appfuse.entity");
				}

				// A dot in the entity name means the person is specifying the package.
				if (pojoName.contains(".")) {
					packageLocation = pojoName.substring(0, pojoName.indexOf(".model"));
					packageLocation = packageLocation.replace(".", "/");
				}

				if (packageLocation.endsWith("model") && packageLocation.indexOf('/') > -1) {
					packageLocation = packageLocation.substring(0, packageLocation.lastIndexOf('/'));
				}
				filename = filename.replace("{basepkg-name}", packageLocation);
				return filename;
			}
		};
		this.setProperties((Properties) getProperties().clone());
		this.setTemplatePath(templatePaths);
		this.setTemplateName(template);
		this.setFilePattern(pattern);
		System.out.println("File Patern" + this.getFilePattern());
		this.setArtifactCollector(getArtifactCollector());
		this.getProperties().put("data", new DataHelper());
		this.getProperties().put("util", new StringUtils());

		return this;
	}

}
