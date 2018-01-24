package com.odysystems.util;

import java.text.SimpleDateFormat;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregDateConverter {
	XMLGregorianCalendar xmlGregorianCalendar;
	public XMLGregDateConverter(){};
	
	public XMLGregDateConverter(XMLGregorianCalendar xmlGregorianCalendar){
		this.xmlGregorianCalendar = xmlGregorianCalendar;
	}
	
	
	public String gregToDateString(XMLGregorianCalendar inDate){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(inDate.toGregorianCalendar().getTime());
		
		return dateString;
	}
}
