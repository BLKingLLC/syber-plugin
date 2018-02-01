package net.syberapps.plugins.exporter;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.codehaus.mojo.hibernate3.ExporterMojo;
import org.codehaus.mojo.hibernate3.HibernateUtils;
import org.codehaus.mojo.hibernate3.configuration.ComponentConfiguration;
import org.hibernate.tool.hbm2x.Exporter;

import net.syberapps.plugins.tools.SyberComponent;

/**
 * Base class for the different appfuse goals based on the Ant tasks of
 * hibernate tools.
 *
 * @author <a href="mailto:jreyes@hiberforum.org">Johann Reyes</a>
 * @version $Id: HibernateExporterMojo.java 3535 2007-03-07 21:02:07Z jreyes $
 * @requiresDependencyResolution test
 */
public abstract class HibernateExporterMojo extends AbstractMojo implements ExporterMojo {
	/**
	 * Parameter that holds components definitions specified by the user.
	 *
	 * @parameter
	 * @noinspection MismatchedQueryAndUpdateOfCollection
	 */
	private List<SyberComponent> components = new ArrayList<SyberComponent>();

	/**
	 * Map holding the default component values for this goal.
	 */
	private Map<String, SyberComponent> defaultComponents = new HashMap<String, SyberComponent>();

	/**
	 * Parameter that holds component properties defined by the user.
	 *
	 * @parameter
	 * @noinspection MismatchedQueryAndUpdateOfCollection
	 */
	private Map<String, String> componentProperties = new HashMap<String, String>();

	/**
     * @component role="org.codehaus.mojo.hibernate3.configuration.ComponentConfiguration"
     * @noinspection MismatchedQueryAndUpdateOfCollection
     */
    private List<ComponentConfiguration> componentConfigurations = new ArrayList<ComponentConfiguration>();

	/**
	 * <i>Maven Internal</i>: Project to interact with.
	 *
	 * @parameter expression="${project}"
	 * @required
	 * @readonly
	 * @noinspection UnusedDeclaration
	 */
	private MavenProject project;

	/**
	 * @parameter expression="${appfuse.fullSource}" default-value="false"
	 * @noinspection UnusedDeclaration
	 */
	private boolean fullSource;

	public boolean isFullSource() {
		return fullSource;
	}

	// --------------------- Interface ExporterMojo ---------------------

	/**
	 * @see ExporterMojo#getComponentProperty(String)
	 */
	public String getComponentProperty(String key) {
		return getComponentProperty(key, null);
	}

	/**
	 * @see ExporterMojo#getComponentProperty(String,boolean)
	 */
	public boolean getComponentProperty(String key, boolean defaultValue) {
		String s = getComponentProperty(key);
		if (s == null) {
			return defaultValue;
		} else {
			// noinspection UnnecessaryUnboxing
			return Boolean.valueOf(s).booleanValue();
		}
	}

	/**
	 * @see ExporterMojo#getProject()
	 */
	public MavenProject getProject() {
		return project;
	}

	// --------------------- Interface Mojo ---------------------

	/**
	 * @see org.apache.maven.plugin.Mojo#execute()
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {

		Thread currentThread = Thread.currentThread();
		ClassLoader oldClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(getClassLoader());
			if (getComponentProperty("skip", false)) {
				getLog().info("skipping plugin execution");
			} else {
				doExecute();
			}
		} finally {
			currentThread.setContextClassLoader(oldClassLoader);
		}
	}

	/**
	 * Adds a default goal.
	 *
	 * @param outputDirectory
	 *            Default output directory
	 * @param implementation
	 *            Default configuration implementation
	 * @param jdk5
	 *            Is this goal being setup for jdk15?
	 * @noinspection unchecked
	 */
	public void addDefaultComponent(String outputDirectory, String implementation, boolean jdk5) {
		SyberComponent component = new SyberComponent();
		System.out.println("GetName is :: " + getName());
		component.setName(getName());
		component.setOutputDirectory(outputDirectory);
		component.setImplementation(implementation);
		defaultComponents.put((jdk5) ? "jdk15" : "jdk14", component);
	}

	/**
	 * Configures the Exporter.
	 *
	 * @param exporter
	 *            Exporter to configure
	 * @return Exporter
	 * @throws MojoExecutionException
	 *             if there is an error configuring the exporter
	 * @noinspection unchecked
	 */
	protected Exporter configureExporter(Exporter exporter) throws MojoExecutionException {
		String implementation = getComponentProperty("implementation", getComponent().getImplementation());
		System.out.println("Implementation is :: " + implementation);
		System.out.println("DC :: " + defaultComponents.size());
		System.out.println("CC :: " + componentConfigurations.size());
		System.out.println("CP :: " + componentProperties.size());
		System.out.println("Comps :: " + components.size());
		
		
		
		
		//ComponentConfiguration componentConfiguration = getComponentConfiguration(implementation);
		//getLog().debug("using " + componentConfiguration.getName() + " task.");

		Properties properties = new Properties();
		properties.putAll(componentProperties);

		exporter.setProperties(properties);
		//exporter.setConfiguration(componentConfiguration.getConfiguration(this));
		System.out.println("configured exporter ###############################");
		exporter.setOutputDirectory(new File(getComponent().getOutputDirectory()));

		return exporter;
	}

	/**
	 * @see ExporterMojo#getComponentProperty(String,String)
	 */
	public String getComponentProperty(String key, String defaultValue) {
		
		for(Map.Entry<String, String> entry : componentProperties.entrySet()) {
			System.out.println("Key :: " + entry.getKey() + ": Value :: " + entry.getValue());
		}
		
		String value = componentProperties.get(key);
		if (value == null || "".equals(value.trim())) {
			return defaultValue;
		}
		return value;
	}

	/**
	 * Returns the ComponentConfiguration for this maven goal.
	 *
	 * @param name
	 *            Configuration task name
	 * @return ComponentConfiguration
	 * @throws MojoExecutionException
	 *             if there is an error finding the ConfigurationTask
	 * @noinspection ForLoopReplaceableByForEach
	 */
	protected ComponentConfiguration getComponentConfiguration(String name) throws MojoExecutionException {
		System.out.println("Checking component cofiguraiton for :: " + name);
		int a = 0;
		System.out.println("number of cc's is :: " + componentConfigurations.size());
		for (Iterator<ComponentConfiguration> it = componentConfigurations.iterator(); it.hasNext();) {
			System.out.println("Checked this " +a + " times.");
			a++;
			ComponentConfiguration componentConfiguration = it.next();
			System.out.println("Checking componetConfiguration :: " + componentConfiguration.getName());
			if (componentConfiguration.getName().equals(name)) {
				return componentConfiguration;
			}
		}
		//throw new MojoExecutionException("Could not get ConfigurationTask.");
		return null;
	}

	/**
	 * Gets the hibernate tool exporter based on the goal that is being called.
	 *
	 * @return Goal exporter
	 */
	protected abstract Exporter createExporter();

	/**
	 * Executes the plugin in an isolated classloader.
	 *
	 * @throws MojoExecutionException
	 *             When there is an erro executing the plugin
	 */
	protected void doExecute() throws MojoExecutionException {
		configureExporter(createExporter()).start();
	}

	/**
	 * Returns the an isolated classloader.
	 *
	 * @return ClassLoader
	 * @noinspection unchecked
	 */
	private ClassLoader getClassLoader() {
		/*
		 * try { List classpathElements = project.getCompileClasspathElements();
		 * classpathElements.add(project.getBuild().getOutputDirectory());
		 * classpathElements.add(project.getBuild().getTestOutputDirectory()); URL
		 * urls[] = new URL[classpathElements.size()]; for (int i = 0; i <
		 * classpathElements.size(); ++i) { urls[i] = new File((String)
		 * classpathElements.get(i)).toURL(); } return new URLClassLoader(urls,
		 * this.getClass().getClassLoader()); }catch (Exception e) {
		 * getLog().debug("Couldn't get the classloader."); return
		 * this.getClass().getClassLoader(); }
		 */

		return this.getClass().getClassLoader();

	}

	/**
	 * Returns the parsed goal to the exporter.
	 *
	 * @return Component
	 * @noinspection ForLoopReplaceableByForEach
	 */
	protected SyberComponent getComponent() {
		SyberComponent defaultGoal = defaultComponents.get(HibernateUtils.getJavaVersion());
		if (!components.isEmpty()) {
			for (Iterator<SyberComponent> it = components.iterator(); it.hasNext();) {
				SyberComponent component = it.next();
				if (getName().equals(component.getName())) {
					if (component.getImplementation() == null) {
						component.setImplementation(defaultGoal.getImplementation());
					}
					if (component.getOutputDirectory() == null) {
						component.setOutputDirectory(defaultGoal.getOutputDirectory());
					}
					return component;
				}
			}
		}
		return defaultGoal;
	}

	public Map<String, String> getComponentProperties() {
		return componentProperties;
	}

	// Allow setting project from tests (AbstractAppFuseMojoTestCase)
	public void setProject(MavenProject project) {
		this.project = project;
	}
}