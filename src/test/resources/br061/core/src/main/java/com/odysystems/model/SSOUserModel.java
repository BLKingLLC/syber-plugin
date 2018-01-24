package com.odysystems.model;

import javax.xml.bind.JAXBElement;

import com.odysystems.soap.ultipro.SSOuser.EmployeeIdentifier;

public class SSOUserModel {
	
	String empID;
	String emailAddress;
	String name;
	String clientID;
	String activationKey;
	JAXBElement<EmployeeIdentifier> jaxEmpId;
	
	
	public JAXBElement<EmployeeIdentifier> getJaxEmpId() {
		return jaxEmpId;
	}
	public void setJaxEmpId(JAXBElement<EmployeeIdentifier> jaxEmpId) {
		this.jaxEmpId = jaxEmpId;
	}
	public String getActivationKey() {
		return activationKey;
	}
	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	
	

}
