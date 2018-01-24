package net.syberapps.plugins.tools;

import org.hibernate.tool.hbm2x.ArtifactCollector;

public class NoXMLFormatArtifactCollector extends ArtifactCollector {

    public void formatFiles() {
        // no-op to prevent XML formatting
    }
}
