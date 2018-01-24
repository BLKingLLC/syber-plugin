////////////////////////////////////////////////////////////////////////
//
// ErrorList.java
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

package com.altova.text.edi;

import java.io.IOException;

import com.altova.text.Generator;
import com.altova.text.ITextNode;
import com.altova.text.edi.Parser.Context;

public class ErrorList extends StructureItem {

	public ErrorList (String name, Particle[] children) {
		super(name, ITextNode.ErrorList, children);
	}
	
	@Override
	public boolean read(Context context) {
		Generator gen = context.getParent().getGeneratorForErrors();
		if( mName.equals( "ParserErrors_Group" ) )
		{
			gen.enterElement( "MF_AK9", ITextNode.Group);
			
			long transCount = context.getParser().getTransactionSetCount();
			long transAccepted = context.getParser().getTransactionSetAccepted();
			
			if ( context.getParser().getF715() == 'R' && transAccepted > 0 )
				gen.insertElement( "F715", "" + 'P', ITextNode.DataElement);
			else				
				gen.insertElement( "F715", "" + context.getParser().getF715(), ITextNode.DataElement);

			//F97: Number of Transaction Sets Included
			gen.insertElement( "F97", "" + transCount, ITextNode.DataElement);
			//F123: Number of Received Transaction Sets
			gen.insertElement( "F123", "" + transCount, ITextNode.DataElement);
			//F2: Number of Accepted Transaction Sets
			gen.insertElement( "F2", "" + transAccepted, ITextNode.DataElement);
			
			gen.leaveElement( "MF_AK9");
		}
		else if( mName.equals( "ParserErrors_Message" ) )
		{
			gen.enterElement( "MF_AK5", ITextNode.Group);
			
			gen.insertElement( "F717", "" + context.getParser().getF717(), ITextNode.DataElement);
			
			gen.leaveElement( "MF_AK5");
		}

		if( gen.getChildren().size() > 0 )
		{
			context.getGenerator().getCurrentNode().getChildren().add( gen.getRootNode() );
			context.getParent().createGeneratorForErrors( mName);
		}
		return true;
	}

	@Override
	public void write(Writer writer, ITextNode node, Particle particle) throws IOException {
		
	}

}