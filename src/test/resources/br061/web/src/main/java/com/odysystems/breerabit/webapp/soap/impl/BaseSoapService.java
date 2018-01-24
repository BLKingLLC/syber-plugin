package com.odysystems.breerabit.webapp.soap.impl;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;





/**
 * @author cuzimbob
 * @param <T>
 * @param <T>  a type variable
 */
public class BaseSoapService<T> {
	protected final Log log = LogFactory.getLog(getClass());
	private Class<T> persistentClass;
	
	public BaseSoapService(){}
	
	public BaseSoapService(final Class<T> persistentClass) {
        this.persistentClass = persistentClass;
	}
	
	public MessageFactory getMessageFactory() throws SOAPException{
	MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
	return messageFactory;
	}
	
	public SOAPMessage createMessage() throws SOAPException{
	SOAPMessage message = getMessageFactory().createMessage();
	return message;
	}
	
	public SOAPMessage getResponse(SOAPMessage request, String url) throws SOAPException, IOException{
    SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
    SOAPConnection soapConnection = soapConnectionFactory.createConnection();    
    SOAPMessage response = soapConnection.call(request, url);
    log.debug("Closing SOAP Connection");
    soapConnection.close();
    return response;
	}
	
	@SuppressWarnings("unchecked")
	public T unmarshall(T clazz, SOAPMessage soapResponse) throws JAXBException, SOAPException{
		this.persistentClass =  (Class<T>) clazz;
		JAXBContext jaxbContext = JAXBContext.newInstance(this.persistentClass);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		T pojo = (T) jaxbUnmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
		//log.debug("\n" + pojo);
	
	return pojo;
	}
	
	public SOAPHeaderElement addHeaderElement(SOAPHeader header, String uri, String uriName, String value) throws SOAPException{
    QName qName = new QName(uri, uriName);
    SOAPHeaderElement element = header.addHeaderElement(qName );
    element.addTextNode(value);
    
    return element;
	}
	
	public SOAPHeaderElement addActionHeader(SOAPHeader header, String uri, String uriName, String actionURI) throws SOAPException{
	    QName qName = new QName(uri, uriName);
	    SOAPHeaderElement element = header.addHeaderElement(qName);
        element.addTextNode(actionURI);
        element.setMustUnderstand(true);
	    
	    return element;
		}
	
	public SOAPElement addBodyElement(SOAPBody body, String uri, String uriName, String value) throws SOAPException{
        QName qRequest = new QName(uri, uriName);
        SOAPElement element = body.addBodyElement(qRequest);
		element.addTextNode(value);
        return element;	
	
	}
	
	public String messageToString(SOAPMessage msg) throws SOAPException, IOException{
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    msg.writeTo(out);
	    String message = new String(out.toByteArray());
		
		return message;
	}
}
