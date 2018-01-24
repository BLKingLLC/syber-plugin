package com.odysystems.soap.ultipro.employeePerson;



import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 
public class UltiproWSSecurityHeaderHandler implements SOAPHandler<SOAPMessageContext> {
 
    String nsCAK = "http://www.ultimatesoftware.com/foundation/authentication/clientaccesskey";
    String tokenNS = "http://www.ultimatesoftware.com/foundation/authentication/ultiprotoken";
    protected final Log log = LogFactory.getLog(UltiproWSSecurityHeaderHandler.class);
	
	@Override
	   public boolean handleMessage(SOAPMessageContext context) {

		System.out.println("Client : handleMessage()......");

		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		//if this is a request, true for outbound messages, false for inbound
		if(isRequest){

		try{
		    SOAPMessage soapMsg = context.getMessage();
	            SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
	            SOAPHeader soapHeader = soapEnv.getHeader();
	            String clientAccessKey = null;
	            String token = null;
	            //if no header, add one
	            if (soapHeader == null){
	            	soapHeader = soapEnv.addHeader();
	            }
	            if(context.containsKey("clientAccessKey")){
	                clientAccessKey = (String) context.get("clientAccessKey");
	                log.debug("Got a client access key ::" + clientAccessKey);
	           }
	            if(context.containsKey("token")){
	            	token = (String) context.get("token");
	            	log.debug("Got a security token :: " + token);
	           }
	            addHeaderElement(soapHeader, nsCAK, "ClientAccessKey", clientAccessKey);
	            addHeaderElement(soapHeader, tokenNS, "UltiProToken", token);




	            soapMsg.saveChanges();

	            //tracking
	            soapMsg.writeTo(System.out);


		   }catch(SOAPException e){
			System.err.println(e);
		   }catch(IOException e){
			System.err.println(e);
		   }

	         }

		   //continue other handler chain
		   return true;
	   }

	public SOAPHeaderElement addHeaderElement(SOAPHeader header, String uri, String uriName, String value) throws SOAPException{
	    QName qName = new QName(uri, uriName);
	    SOAPHeaderElement element = header.addHeaderElement(qName );
	    element.addTextNode(value);
	    
	    return element;
		}
		@Override
		public boolean handleFault(SOAPMessageContext context) {
			System.out.println("Client : handleFault()......");
			return true;
		}

		@Override
		public void close(MessageContext context) {
			System.out.println("Client : close()......");
		}

		@Override
		public Set<QName> getHeaders() {
			System.out.println("Client : getHeaders()......");
			return null;
		}

	  


	}