package net.syberapps.plugins.goals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.maven.archetype.ArchetypeGenerationRequest;
import org.apache.maven.archetype.ArchetypeGenerationResult;
import org.apache.maven.archetype.ArchetypeManager;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.ArtifactRepositoryFactory;
import org.apache.maven.artifact.repository.layout.DefaultRepositoryLayout;
import org.apache.maven.model.Build;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.building.DefaultModelBuilder;
import org.apache.maven.model.building.DefaultModelBuilderFactory;
import org.apache.maven.model.building.ModelBuildingException;
import org.apache.maven.model.building.Result;
import org.apache.maven.model.io.DefaultModelWriter;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.apache.maven.plugin.testing.stubs.MavenProjectStub;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.FileUtils;
import org.codehaus.plexus.util.StringUtils;
import org.codehaus.plexus.util.xml.Xpp3Dom;

import net.syberapps.plugins.exporter.HibernateExporterMojo;

public abstract class AbstraceSyberPluginTestCase extends AbstractMojoTestCase {
	/*
	 * private boolean genericCore = false;
	 * 
	 * public void setGenericCore(boolean genericCore) { this.genericCore =
	 * genericCore; }
	 */

	protected boolean checkExists(String target) {
		return (getTestFile(target).exists());
	}

	protected void deleteDirectory(String targetFolder) throws Exception {
		FileUtils.deleteDirectory(getTestFile(targetFolder));
	}

	protected HibernateExporterMojo getHibernateMojo(String goal, String implementation) throws Exception {
		String path = "target/test-classes/" + implementation + "/" + goal + "-config.xml";
		if (true) {
			path = "target/test-classes/" + implementation + "/generic-config.xml";
		}
		HibernateExporterMojo mojo = (HibernateExporterMojo) lookupMojo(goal, getTestFile(path));
		mojo.getLog().info("executing: " + getTestFile(path).getPath()); 
		setVariableValueToObject(mojo, "project", getMavenProject());

		// disableInstallation to prevent installation
		System.setProperty("disableInstallation", "true");

		mojo.setProject(getMavenProject());

		return mojo;
	}

	/*
	 * protected InstallArtifactsMojo getInstallMojo(String goal, String
	 * implementation) throws Exception { String path = "target/test-project";
	 * InstallArtifactsMojo mojo = (InstallArtifactsMojo) lookupMojo(goal,
	 * getTestFile(path)); mojo.getLog().info("executing: " +
	 * getTestFile(path).getPath()); //setVariableValueToObject(mojo, "project",
	 * getMavenProject()); return mojo; }
	 */
	protected void copyFileToDirectory(String from, String to) throws Exception {
		FileUtils.copyFileToDirectory(getTestFile(from), getTestFile(to));
	}

	protected MavenProject getMavenProject() {
		final Build build = new Build();
		build.setDirectory("target");
		build.setOutputDirectory("target/classes");
		build.setTestOutputDirectory("target/test-classes");
		build.addPlugin(getPlugin());

		return new MavenProjectStub() {
			String daoFramework = "hibernate";
			String webFramework = "struts";
			Properties props;

			public Build getBuild() {
				return build;
			}

			public String getArtifactId() {
				return "test-project";
			}

			public String getGroupId() {
				return "com.company";
			}

			public String getPackaging() {
				return "war";
			}

			@Override
			public Properties getProperties() {
				if (props == null) {
					props = new Properties();
					props.put("dao.framework", this.daoFramework);
					props.put("web.framework", this.webFramework);
					props.put("amp.disableInstallation", "true");
				}
				return props;
			}
		};
	}

	protected MavenProject createTestProject(String archetypeArtifactId, String archetypeVersion) throws Exception {
		MavenProject project = getMavenProject();

		FileUtils.deleteDirectory(getTestFile("target/" + project.getArtifactId()));

		ArchetypeGenerationRequest req = new ArchetypeGenerationRequest();

		ArchetypeManager archetype = (ArchetypeManager) lookup(ArchetypeManager.ROLE);

		String localRepoPath = System.getProperty("localRepoPath");

		if (StringUtils.isEmpty(localRepoPath)) {
			localRepoPath = System.getProperty("user.home") + System.getProperty("file.separator") + ".m2"
					+ System.getProperty("file.separator") + "repository";
		}

		String mavenRepoLocal = "file://" + localRepoPath;

		/*
		 * ArtifactRepositoryLayout layout = (ArtifactRepositoryLayout)
		 * container.lookup(ArtifactRepositoryLayout.ROLE, "default");
		 * 
		 * ArtifactRepositoryLayout lt = new DefaultRepositoryLayout();
		 */

		ArtifactRepositoryFactory fac = (ArtifactRepositoryFactory) lookup(ArtifactRepositoryFactory.ROLE);

		ArtifactRepository localRepository = fac.createArtifactRepository("local", mavenRepoLocal,
				new DefaultRepositoryLayout(), null, null);

		assertNotNull(localRepository);
		System.out.println(localRepository.getBasedir().toString());

		List<ArtifactRepository> remoteRepositories = new ArrayList<ArtifactRepository>();

		String archetypeGroupId = "org.appfuse.archetypes";

		ArchetypeGenerationRequest request = new ArchetypeGenerationRequest();
		request.setGroupId(project.getGroupId()).setArtifactId(project.getArtifactId()).setVersion("1.0-SNAPSHOT");
		request.setArchetypeGroupId(archetypeGroupId).setArchetypeArtifactId(archetypeArtifactId);
		request.setArchetypeVersion(archetypeVersion);
		request.setLocalRepository(localRepository);
		request.setRemoteArtifactRepositories(remoteRepositories);
		request.setOutputDirectory(getTestFile("target").getAbsolutePath());

		ArchetypeGenerationResult result = archetype.generateProjectFromArchetype(request);
		try {
			System.out.println(result.getCause().getMessage());
		} catch (NullPointerException e) {
			// Means it worked properly.
		}

		return project;
	}

	protected void print(String str) {
		System.out.println(str);
	}

	protected void printFile(File file) {
		String str = new String();
		try {
			str = org.apache.commons.io.FileUtils.readFileToString(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
	}

	protected String fileToString(File file) {
		String str = new String();
		try {
			str = org.apache.commons.io.FileUtils.readFileToString(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	private Plugin getPlugin() {
		Plugin plugin = new Plugin();
		/*
		 * <groupId>syberapps.net</groupId> <artifactId>syber-plugin</artifactId>
		 * <version>0.1-SNAPSHOT</version> <packaging>maven-plugin</packaging>
		 * 
		 * <name>Syber Plugin</name>
		 */
		plugin.setGroupId("syberapps.net");
		plugin.setArtifactId("syber-plugin");
		plugin.setVersion("0.1-SNAPSHOT");

		PluginExecution ex = new PluginExecution();
		ex.addGoal("GenSampleData");
		List<PluginExecution> exes = new ArrayList<PluginExecution>();
		exes.add(ex);

		/*
		 * <configuration> <components> <component> <name>gen</name>
		 * <outputDirectory>target/appfuse/generated</outputDirectory>
		 * <implementation>annotationconfiguration</implementation> </component>
		 * </components> <componentProperties>
		 * <configurationfile>target/test-classes/annotationconfiguration/hibernate.cfg.
		 * xml</configurationfile> </componentProperties> </configuration>
		 */

		plugin.setExecutions(exes);

		// Compiler
		Plugin pluginCompiler = new Plugin();
		pluginCompiler.setGroupId("syberapps.net");
		pluginCompiler.setArtifactId("syber-plugin");
		pluginCompiler.setVersion("0.1-SNAPSHOT");

		Xpp3Dom pcComponentProps = new Xpp3Dom("componentProperties");
		addConfig(pcComponentProps, "configurationfile",
				"target/test-classes/annotationconfiguration/hibernate.cfg.xml");
		
		Xpp3Dom pComponent = new Xpp3Dom("component");
		/*
		 * <component> <name>gen</name>
		 * <outputDirectory>target/appfuse/generated</outputDirectory>
		 * <implementation>annotationconfiguration</implementation> </component>
		 */
		addConfig(pComponent, "name", "GenSampleData");
		addConfig(pComponent, "outputDirectory", "GenSampleData");
		addConfig(pComponent, "implementation", "annotationconfiguration");

		// pComponent.addChild(pcComponentProps);
		Xpp3Dom pcComponents = new Xpp3Dom("components");
		pcComponents.addChild(pComponent);
		Xpp3Dom pluginConfig = new Xpp3Dom("configuration");
		pluginConfig.addChild(pcComponents);
		pluginConfig.addChild(pcComponentProps);

		// addConfig(pluginConfig, "components", "1.6");
		pluginCompiler.setConfiguration(pluginConfig);

		return pluginCompiler;

	}

	private void addConfig(Xpp3Dom config, String key, String value) {
		Xpp3Dom child = new Xpp3Dom(key);
		child.setValue(value);
		config.addChild(child);
	}

	protected Model build(File pom) throws ModelBuildingException {
		DefaultModelBuilder builder = new DefaultModelBuilderFactory().newInstance();
		Result<? extends Model> thang = builder.buildRawModel(pom, 0, false);
		Model otherThang = thang.get();
		String artid = otherThang.getArtifactId();
		print("path is :: " + otherThang.toString());
		return otherThang;

	}

	protected Model addPlugin(Model model, File file) throws IOException {
		Build build = model.getBuild();
		build.addPlugin(getPlugin());
		model.setBuild(build);
		DefaultModelWriter writer = new DefaultModelWriter();
		writer.write(file, null, model);

		return model;
	}

}
