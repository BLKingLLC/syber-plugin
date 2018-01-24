package net.syberapps.plugins.goals;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="GenSampleData")
public class SampleData extends AbstractMojo{
	// Log log = LogFactory.getLog(getClass());
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info( "Executing Goal." );
	}
	


}
