package net.syberapps.plugins.goals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import freemarker.template.TemplateException;
import net.syberapps.plugins.tools.SampleDataGenerator;

@Mojo(name = "GenSampleData")
public class SampleData extends AbstractMojo {
	// Log log = LogFactory.getLog(getClass());

	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;
	
	private List<File> entities = new ArrayList<File>();
	int limiter = 0;
	
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

	public MavenProject getProject() {
		return this.project;
	}

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Executing Goal.");

		getLog().info(getProject().toString());

		// TODONE: Load the subject Project.
		// TODO: Get a list of Pojo's to that are @Entities

		String sourceDir = project.getBasedir().getName();
		getLog().info("Source Directory is :: " + sourceDir);

		List<File> pojos = new ArrayList<File>();
		getEntities(project);
		List<String> pojoNames = convertFilesToNames(entities);

		// TODO: Determine Source Directory
		// TODO: Determine Destination Directory
		// TODO: Get rid of generic core stuff.

		// MavenProject project, String pojoName, String sourceDirectory, String
		// destinationDirectory, boolean genericCore)

		// MavenProject project = null;
		String pojoName = null;
		String sourceDirectory = null;
		String destinationDirectory = getSrcTestResources(project.getBasedir());
		boolean genericCore = false;

		for (String name : pojoNames) {
			SampleDataGenerator gen = new SampleDataGenerator(project, name, sourceDirectory, destinationDirectory,
					genericCore);

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
		List<File> inFiles = Arrays.asList(project2.getModel().getProjectDirectory());
		traverse(inFiles);
		
	}
	
	public void traverse(List<File> files) {
		getLog().info("I've done this " + limiter + " times.");
		limiter++;
	    for (File file : files) {
	        if (file.isDirectory()) {
	            
	        	traverse(Arrays.asList(file.listFiles()));
	        } else {
	            try {
					if(scan(file)) {
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
		String strPath = baseDir.getPath() + "src/test/resources";
		String returnPath = strPath + "/sampleData";
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
		if(file.getName().equals("Person.java")) {
			getLog().info(fileAsString);
		}

		if (fileAsString.contains("@Entity")) {
			getLog().info(file.getName() + " contains entity.");
			return true;

		}

		return false;
	}

}
