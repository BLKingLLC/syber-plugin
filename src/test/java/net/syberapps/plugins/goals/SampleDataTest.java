package net.syberapps.plugins.goals;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.Mojo;
import org.apache.maven.project.MavenProject;

import net.syberapps.plugins.tools.SampleDataGenerator;

public class SampleDataTest extends AbstraceSyberPluginTestCase {

	
	MavenProject project;
	File pom;
	
	/** {@inheritDoc} */
	protected void setUp() throws Exception {
		// required
		super.setUp();

	}

	/** {@inheritDoc} */
	protected void tearDown() throws Exception {
		// required
		super.tearDown();

	}

	/**
	 * @throws Exception
	 *             if any
	 */
	public void testSomething() throws Exception {
		setupProject();
		//path is :: /home/cuzimbob/git/syber-plugin/target/test-project
		
		// TODO: Add test entity into project directory
		// TODO: Get a list of Pojo's to that are @Entities

		// TODO: Determine Source Directory
		// TODO: Determine Destination Directory
		// TODO: Get rid of generic core stuff.

		// for each pojo do sd.installSampleData() via doStuff();

		// SampleDataGenerator sd = new SampleDataGenerator(null, fName, fName, fName,
		// false);

		Mojo myMojo = (SampleData) lookupMojo("GenSampleData", pom);
		setVariableValueToObject(myMojo, "project", project);
		assertNotNull(myMojo);
		
		myMojo.execute();

	}
	
	public void testSomethingElse() throws Exception {
		String path = "target/test-classes/testProjectAlpha/pom.xml";
				
		File newPOm = getTestFile(path);
		
		assertNotNull(newPOm);
		assertTrue(newPOm.exists());
		Mojo myMojo = (SampleData) lookupMojo("GenSampleData", newPOm);
		assertNotNull(myMojo);
		myMojo.execute();
		
	}
	
	private void setupProject() throws Exception {
		// TODONE: Load the subject Project.
		String path = "target/test-project/pom.xml";
		createTestProject("appfuse-core-archetype", "3.5.0");
		File intPom = getTestFile(path);
		// TODOONE: Add Plugin into project
		Model model = build(intPom);
		model = addPlugin(model, intPom);
		pom = model.getPomFile();
		
		assertNotNull(pom);
		assertTrue(pom.exists());
		project = new MavenProject(model);
		
	}
	
	public void testFileUtils() throws Exception {
		setupProject();
		SampleData sd = new SampleData();
		
		List<File> pojos = new ArrayList<File>();
		sd.getEntities(project);
		pojos = sd.getEntities();
		assertTrue(pojos.size() >= 1);
		List<String> pojoNames = sd.convertFilesToNames(pojos);
		assertTrue(pojoNames.size() >=1);

		
	}

}
