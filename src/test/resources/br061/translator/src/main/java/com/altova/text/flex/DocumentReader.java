////////////////////////////////////////////////////////////////////////
//
// DocumentReader.java
//
// This file was generated by MapForce 2015sp2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.flex;

import com.altova.text.*;

public class DocumentReader {
	private Range range;
	private Generator outputGenerator;
	
	public DocumentReader(String content, Generator generator) {
		this.outputGenerator = generator;
		this.range = new Range(content);
	}
	
	public DocumentReader(DocumentReader doc) {
		this.range = new Range(doc.getRange());
		this.outputGenerator = doc.getOutputTree();
	}
	
	public DocumentReader(DocumentReader doc, Range range) {
		this.range = new Range(range);
		this.outputGenerator = doc.getOutputTree();
	}
	
	public Generator getOutputTree() {
		return outputGenerator;
	}
	
	public Range getRange() {
		return range;
	}
	
	public String getContent() {
		return range.getContent();
	}
}
