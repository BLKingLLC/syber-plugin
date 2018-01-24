package net.syberapps.plugins.goals;

import java.io.File;

import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;

public class SampleDataTest extends AbstractMojoTestCase{

	
	 /** {@inheritDoc} */
    protected void setUp()
        throws Exception
    {
        // required
        super.setUp();

    }

    /** {@inheritDoc} */
    protected void tearDown()
        throws Exception
    {
        // required
        super.tearDown();

    }

    /**
     * @throws Exception if any
     */
    public void testSomething()
        throws Exception
    {
        File pom = getTestFile( "src/test/resources/br061/pom.xml" );
        assertNotNull( pom );
        assertTrue( pom.exists() );

        Mojo myMojo = (SampleData) lookupMojo( "GenSampleData", pom );
        assertNotNull( myMojo );
        myMojo.execute();

    }
	
	
}
