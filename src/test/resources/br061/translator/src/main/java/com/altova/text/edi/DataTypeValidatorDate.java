////////////////////////////////////////////////////////////////////////
//
// DataTypeValidatorDate.java
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

import com.altova.text.ITextNode;

public class  DataTypeValidatorDate extends DataTypeValidator {

	public DataTypeValidatorDate (int minLength, int maxLength) {
		super (minLength, maxLength, null);
	}

	public boolean makeValidOnRead (StringBuffer s, Parser.Context context, Scanner.State beforeRead) {
		String sValue = s.toString();
		int effLen = effectiveLength(s, context.getScanner().getServiceChars().getReleaseCharacter());
		validateLength(effLen, sValue, context, beforeRead);
		if( !EDIDateTimeHelpers.IsDateCorrect( sValue) )
			context.handleError( 
				Parser.ErrorType.InvalidDate,
				ErrorMessages.GetInvalidDateMessage(
					context.getParticle().getName(),
					sValue,
					"date"
				),
				new ErrorPosition( beforeRead ),
				sValue
			);

		while (Character.isWhitespace(s.charAt(0)))
			s.deleteCharAt(0);

		if (s.toString().length() == 6 )
			if (Integer.parseInt(s.substring(0, 2)) <= 50)
				s.insert(0, "20");
			else
				s.insert(0, "19");

		s.insert(4, '-');
		s.insert(7, '-');
		return true;
	}

    public boolean makeValidOnWrite (StringBuffer s, ITextNode node, Writer writer, boolean esc) {
        return makeValidOnWrite(s, node, writer);
    }
    
	public boolean makeValidOnWrite (StringBuffer s, ITextNode node, Writer writer) {
		int i=0;

		if (s.length() >= 10)
		{
			// schema dateTime
			s.replace(0, s.length(), s.substring(0, 4) + s.substring(5, 7) + s.substring(8, 10));

		}

		while (i < s.length())
			if (s.charAt(i) == '-')
				s.deleteCharAt(i);
			else
				i++;

		if (getMaxLength() == 6 && s.length() == 8)
			s.delete(0, 2);

		s.setLength(getMinLength());
		return true;
	}
}
