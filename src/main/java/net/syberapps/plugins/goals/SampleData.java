package net.syberapps.plugins.goals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.io.FileUtils;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.tools.ant.Project;
import org.codehaus.mojo.hibernate3.configuration.ComponentConfiguration;
import org.hibernate.cfg.Configuration;
//import org.codehaus.plexus.components.interactivity.Prompter;
import org.hibernate.tool.hbm2x.Exporter;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

import freemarker.template.TemplateException;
import net.syberapps.plugins.exporter.HibernateExporterMojo;
import net.syberapps.plugins.tools.AntUtils;
import net.syberapps.plugins.tools.SampleDataGenerator;

@Mojo(name = "GenSampleData")
public class SampleData extends HibernateExporterMojo {
	// Log log = LogFactory.getLog(getClass());

	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	boolean generateCoreOnly;
	boolean generateWebOnly;
	String pojoName;

	private List<File> entities = new ArrayList<File>();
	int limiter = 0;

	/**
	 * This is a prompter that can be user within the maven framework.
	 *
	 * @component
	 */
	/*Prompter prompter;*/

	/**
	 * The path where the generated artifacts will be placed. This is intentionally
	 * not set to the default location for maven generated sources. This is to keep
	 * these files out of the eclipse/idea generated sources directory as the
	 * intention is that these files will be copied to a source directory to be
	 * edited and modified and not re generated each time the plugin is run. If you
	 * want to regenerate the files each time you build the project just set this
	 * value to ${basedir}/target/generated-sources or set the flag on eclipse/idea
	 * plugin to include this file in your project file as a source directory.
	 *
	 * @parameter expression="${appfuse.destinationDirectory}"
	 *            default-value="${basedir}"
	 * @noinspection UnusedDeclaration
	 */
	private String destinationDirectory;

	/**
	 * The directory containing the source code.
	 *
	 * @parameter expression="${appfuse.sourceDirectory}"
	 *            default-value="${basedir}/target/appfuse/generated-sources"
	 * @noinspection UnusedDeclaration
	 */
	private String sourceDirectory;

	/**
	 * Allows disabling installation - for tests and end users that don't want to do
	 * a full installation
	 *
	 * @parameter expression="${appfuse.disableInstallation}" default-value="false"
	 */
	private boolean disableInstallation;

	/**
	 * @parameter expression="${appfuse.genericCore}" default-value="true"
	 * @noinspection UnusedDeclaration
	 */
	private boolean genericCore;

	/**
	 * @parameter expression="${appfuse.templateDirectory}"
	 *            default-value="${basedir}/src/test/resources"
	 * @noinspection UnusedDeclaration
	 */
	private String templateDirectory;

	/**
	 * Path for where to generate files at.
	 */

	private String fullPath = null;

	/**
	 * Default constructor.
	 */
	public SampleData() {
		addDefaultComponent("target/appfuse/generated-sources", "configuration", false);
		addDefaultComponent("target/appfuse/generated-sources", "annotationconfiguration", false);
		addDefaultComponent("target/appfuse/generated-sources", "GenSampleData", false);
		//getComponentProperties().put("configurationfile", "src/main/resources/hibernate.cfg.xml");
		
	}

	private void addEntity(File file) {
		this.entities.add(file);
		getLog().info("size is now " + entities.size());
	}

	protected List<File> getList() {
		return entities;
	}
	
	

	public void setProject(MavenProject project) {
		this.project = project;
	}

	public void setSourceDirectory(String src) {
		this.sourceDirectory = src;
	}

	public MavenProject getProject() {
		return this.project;
	}

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Executing Goal.");

		sourceDirectory = "target/" + project.getBasedir();
		List<File> pojos = new ArrayList<File>();
		getEntities(project);
		List<String> pojoNames = convertFilesToNames(entities);
		String destinationDirectory = getSrcTestResources(project.getBasedir());
		System.out.println("Destination Directory is :: " + destinationDirectory);
		Project antProject = AntUtils.createProject();

		// configureExporter("appfuse/dao/sample-data.ftl",
		// "src/test/resources/{class-name}-sample-data.xml").start();

		for (String name : pojoNames) {
			getLog().info("Name of pojo is :: " + name);
			pojoName = name;
			
			
			SampleDataGenerator gen = new SampleDataGenerator(project, name, sourceDirectory, destinationDirectory,
					antProject);
			gen.setPojoName(name);
			configureExporter(gen);
			System.out.println("Configured the exporter.");

			getLog().info("Ready to do stuff.");
			try {
				gen.doStuff();
				getLog().info("I did some stuff.");
			} catch (IOException e) {
				getLog().error(e);
			} catch (TemplateException e) {
				getLog().error(e);
			}
		}

	}

	protected void getEntities(MavenProject project2) {
		List<File> inFiles = Arrays.asList(project2.getBasedir());
		traverse(inFiles);

	}

	public void traverse(List<File> files) {
		// getLog().info("I've done this " + limiter + " times.");
		getLog().debug("size of files is :: " + files.size());
		limiter++;
		for (File file : files) {
			if (file.isDirectory()) {

				traverse(Arrays.asList(file.listFiles()));
			} else {
				try {
					if (scan(file)) {
						getLog().info("adding " + file.getName() + " to entities");
						addEntity(file);
					}
				} catch (IOException e) {
					getLog().warn(file.getName() + " Caused an IO Error");
					continue;
				}
			}
		}
	}

	protected String getSrcTestResources(File baseDir) {
		String strPath = baseDir.getPath() + "/src/test/resources";
		String returnPath = strPath;// + "/sampleData";
		if (createDirectory(returnPath)) {

		}
		return returnPath;

	}

	protected boolean createDirectory(String directoryName) {
		File dir = new File(directoryName);

		if (!dir.exists()) {
			if (dir.mkdirs()) {
				String message = "Created directory [" + directoryName + "]";
				getLog().debug(message);
				return true;
			} else {
				getLog().error("Failed to create directory [" + directoryName + "]");
				return false;
			}
		}
		return true;
	}

	protected List<String> convertFilesToNames(List<File> pojos) {
		List<String> names = new ArrayList<String>();
		for (File file : pojos) {
			names.add(file.getName());
		}
		return names;
	}

	@Override
	public String toString() {

		return this.project.getArtifactId();
	}

	protected Boolean scan(File file) throws IOException {
		getLog().info("Scanning " + file.getName());
		BufferedReader buf = new BufferedReader(new FileReader(file));

		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line).append("\n");
			line = buf.readLine();
		}
		String fileAsString = sb.toString();

		if (fileAsString.contains("@Entity")) {
			getLog().info(file.getName() + " contains entity.");
			return true;

		}

		return false;
	}

	/**
	 * @see org.appfuse.mojo.HibernateExporterMojo#configureExporter(org.hibernate.tool.hbm2x.Exporter)
	 */
	protected Exporter configureExporter(Exporter exp) throws MojoExecutionException {
		// Read in AppFuseExporter#configureExporter to decide if a class should be
		// generated or not
		System.setProperty("appfuse.entity", pojoName);

		// add output directory to compile roots
		getProject().addCompileSourceRoot(new File(getComponent().getOutputDirectory()).getPath());

		// now set the extra properties for the AppFuseExporter

		SampleDataGenerator exporter = (SampleDataGenerator) super.configureExporter(exp);
		exporter.getProperties().setProperty("ejb3", getComponentProperty("ejb3", "true"));
		exporter.getProperties().setProperty("jdk5", getComponentProperty("jdk5", "true"));
		
		/*Properties thing = exporter.getProperties();
		Configuration thatThing = exporter.getConfiguration();
		Iterator otherThing = exporter.getConfiguration().getCollectionMappings();
		for (Iterator<Configuration> it = otherThing; it.hasNext();) {
			Configuration thang = it.next();
			System.out.println("THANG IS ::::::::::::::::::::: " + thang.toString());
			
		}*/

		if (generateCoreOnly) {
			exporter.getProperties().setProperty("generate-core", "true");
		} else if (generateWebOnly) {
			exporter.getProperties().setProperty("generate-web", "true");
		}

		String rootPackage = (fullPath != null) ? fullPath : getProject().getGroupId();

		// AppFuse-specific values
		exporter.getProperties().setProperty("basepackage", rootPackage);
		exporter.getProperties().setProperty("daoframework", getProject().getProperties().getProperty("dao.framework"));

		String webFramework = (getProject().getProperties().containsKey("web.framework"))
				? getProject().getProperties().getProperty("web.framework")
				: "";

		exporter.getProperties().setProperty("webframework", webFramework);

		exporter.getProperties().setProperty("packaging", getProject().getPackaging());
		exporter.getProperties().setProperty("genericcore", String.valueOf(genericCore));

		if (templateDirectory != null) {
			exporter.getProperties().setProperty("templatedirectory", templateDirectory);
		}

		if (isFullSource())
			exporter.getProperties().setProperty("appfusepackage", rootPackage);
		else {
			exporter.getProperties().setProperty("appfusepackage", "org.appfuse");
		}

		// See if the project has security enabled
		boolean hasSecurity = false;
		if (getProject().getPackaging().equals("war")) {
			Collection<File> sourceFiles = FileUtils.listFiles(getProject().getBasedir(), new String[] { "xml" }, true);
			for (File file : sourceFiles) {
				if (file.getPath().contains("security.xml")) {
					hasSecurity = true;
					break;
				}
			}
		}
		exporter.getProperties().setProperty("hasSecurity", String.valueOf(hasSecurity));

		// determine if using Main or Home for Tapestry
		if (webFramework.equals("tapestry")) {
			boolean useHome = true;
			Collection<File> sourceFiles = FileUtils.listFiles(getProject().getBasedir(), new String[] { "java" },
					true);
			for (File file : sourceFiles) {
				if (file.getPath().contains("Home.java")) {
					useHome = false;
					break;
				}
			}
			exporter.getProperties().setProperty("useHome", String.valueOf(useHome));
		}

		exporter.configured();
		return exporter;
	}

	public String getName() {
		return new String("SyberPlugin");
	}

	private void log(String msg) {
		getLog().info("[AppFuse] " + msg);
	}

	/**
	 * Instantiates a org.appfuse.tool.AppFuseExporter object.
	 *
	 * @return POJOExporter
	 */
	protected Exporter createExporter() {
		return new SampleDataGenerator();
	}

	public class POJOSearcher extends DefaultHandler {
		private String pojoName;
		private boolean foundPojo;
		private String xmlString;

		public POJOSearcher(String xmlString) {
			this.xmlString = xmlString;
		}

		public boolean searchForPojo(String pojoName) {
			this.pojoName = pojoName;
			this.foundPojo = false;

			SAXParserFactory spf = SAXParserFactory.newInstance();
			try {
				spf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);

				SAXParser sp = spf.newSAXParser();
				sp.parse(new InputSource(new StringReader(xmlString)), this);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}

			return foundPojo;
		}
	}
	
	

}
