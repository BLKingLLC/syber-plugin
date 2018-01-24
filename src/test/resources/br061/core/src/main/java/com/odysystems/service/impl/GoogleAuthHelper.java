package com.odysystems.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;


public class GoogleAuthHelper {
protected final transient Log log = LogFactory.getLog(getClass());
	

	
	 public Credential getAuthCredential(List<String> scopes, String serviceAccountUser) throws Exception {
		JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
		 HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
		   
	    	InputStream in = getClass().getClassLoader().getResourceAsStream("odyssey-saml-5337839aad50.p12");
	    	
	    	File file = createFileFromInputStream(in);
	    	GoogleCredential credential = new GoogleCredential.Builder()
	    			.setTransport(httpTransport)
	    			.setJsonFactory(JSON_FACTORY)
	    			.setServiceAccountId("brabbitp12@odyssey-saml.iam.gserviceaccount.com")
	    			.setServiceAccountPrivateKeyFromP12File(file)
	    			.setServiceAccountScopes(scopes)
	    			//TODO:  Change this to an input for currently logged in user.
	    			.setServiceAccountUser(serviceAccountUser)
	    			.build();
	                

	        return credential;
	    }
	

	private File createFileFromInputStream(InputStream inputStream) {

		   try{
			  String path = System.getProperty("java.io.tmpdir");
			  log.debug("File path is :: " + path);
		      File f = new File(path + "/my_file_name");
		      OutputStream outputStream = new FileOutputStream(f);
		      byte buffer[] = new byte[1024];
		      int length = 0;

		      while((length=inputStream.read(buffer)) > 0) {
		        outputStream.write(buffer,0,length);
		      }

		      outputStream.close();
		      inputStream.close();

		      return f;
		   }catch (IOException e) {
		         log.debug("Caught a file IO exception while creating the authentication file.  " + e.getMessage());
		   }

		   return null;
		}
	


}
