package com.odysystems.breerabit.webapp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.odysystems.Constants;

public class PayrollPreProcessor {

	protected static Log log = LogFactory.getLog(PayrollPreProcessor.class);
	
	// May not need this file.  Looks like commons-io can do it in 3 LCO
	
	public static void payrollStripper(String fileName, String path) throws IOException
    {
        File inputFile = new File(path + Constants.FILE_SEP + fileName);
        File tempFile = new File(path + Constants.FILE_SEP + "tmp.csv");
        log.debug("loading file");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        log.debug("loading temp file");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        log.debug("entered into stripper while/if section");
        while((currentLine = reader.readLine()) != null) {
           
        	if(null!=currentLine && !currentLine.contains("!")){
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        }
        log.debug("completed file stripping");
        writer.close(); 
        reader.close(); 
        boolean successful = tempFile.renameTo(inputFile);
        System.out.println(successful);
        log.debug(successful);
        
 
      
    }
	
}
