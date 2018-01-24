////////////////////////////////////////////////////////////////////////
//
// TextDocument.java
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

import com.altova.AltovaException;
import com.altova.text.FileIO;
import com.altova.text.Generator;

public abstract class TextDocument  {
	private Generator generator = new Generator();
	protected CommandProject rootCommand;
	private String m_Encoding = "";
	private boolean m_bBigEndian = false;
	private boolean m_bBOM = false;
	protected int m_LineEnd = 0;

	public void parseString(String buffer) {
		if (rootCommand == null)
			throw new AltovaException("No syntax definition");
		DocumentReader doc  = new DocumentReader(buffer, generator);
		rootCommand.readText(doc);
	}

	public Generator getGenerator() {
		return generator;
	}

	public void setEncoding( String encoding, boolean bBigEndian, boolean bBOM )
	{
		m_Encoding = encoding;
		m_bBigEndian = bBigEndian;
		m_bBOM = bBOM;
	}
	
	public void parse(com.altova.io.Input input) throws Exception
	{
		switch (input.getType())
    	{
    		case com.altova.io.Input.IO_DOM:
    			throw new Exception ("This is text component, it cannot be read from DOM!");
    			
    		case com.altova.io.Input.IO_STREAM:
    			parse(input.getStream());
    			break;
    		
    		case com.altova.io.Input.IO_READER:
    			parse(input.getReader());
    			break;
    			
    		default:
    			throw new Exception ("Unknown output type");
    	}
	}
	
	public void parse(java.io.InputStream stream) throws Exception
	{
		parse(new FileIO(stream, m_Encoding, m_bBigEndian, m_bBOM));
	}
	
	public void parse(java.io.Reader reader) throws Exception
	{
		parse(new FileIO(reader));
	}
	
	private void parse(FileIO io) throws Exception 
	{
		try 
		{
			parseString(io.readToEnd().toString());
		}
		catch (Exception x)
		{
			throw new com.altova.SourceInstanceUnavailableException("Error reading from stream", x);
		}
	}

	public void save(com.altova.io.Output output) throws Exception
	{
		switch (output.getType())
    	{
    		case com.altova.io.Output.IO_DOM:
    			throw new Exception ("This is text component, it cannot be written into DOM!");
    			
    		case com.altova.io.Output.IO_STREAM:
    			save(output.getStream());
    			break;
    			
    		case com.altova.io.Output.IO_WRITER:
    			save(output.getWriter());
    			break;
    			
    		default:
    			throw new Exception ("Unknown output type");
    	}
	}
	
	public void save(java.io.Writer writer) throws Exception 
	{
		StringBuffer text = save();
		try
		{
			writer.write(text.toString(), 0, text.length());
			writer.flush();
		}
		catch (Exception x) 
		{
            throw new com.altova.TargetInstanceUnavailableException("Error writing to stream", x);
        }
	}
	
	public void save(java.io.OutputStream stream) throws Exception 
	{
		StringBuffer text = save();
		try
		{
			FileIO io = new FileIO(stream, m_Encoding, m_bBigEndian, m_bBOM);
			io.writeToEnd(text);
		} 
		catch (Exception x) 
		{
            throw new com.altova.TargetInstanceUnavailableException("Error writing to stream", x);
        }
	}
	
	private StringBuffer save() throws Exception 
	{
		if (rootCommand == null)
			throw new AltovaException("No syntax definition");
		
		StringBuffer text = new StringBuffer();
		
		DocumentWriter doc = new DocumentWriter(generator.getRootNode(), text, m_LineEnd);
		rootCommand.writeText(doc);
		return text;
	}
}