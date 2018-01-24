package com.odysystems.model;

import java.io.Serializable;

public class EmployeeList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2619992295932486275L;
	String action;
	String email;
	String firstName;
	String google;
	Boolean googleSetup;
	String lastName;
	String ulti;
	Boolean ultiSSOSetup;
	String originalPrimary;
	String originalAlternate;
	String empID;
	
		
	
	public String getOriginalPrimary() {
		return originalPrimary;
	}
	public void setOriginalPrimary(String originalPrimary) {
		this.originalPrimary = originalPrimary;
	}
	public String getOriginalAlternate() {
		return originalAlternate;
	}
	public void setOriginalAlternate(String originalAlternate) {
		this.originalAlternate = originalAlternate;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getAction() {
		return action;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getGoogle() {
		return google;
	}
	public Boolean getGoogleSetup() {
		return googleSetup;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUlti() {
		return ulti;
	}
	public Boolean getUltiSSOSetup() {
		return ultiSSOSetup;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setGoogle(String google) {
		this.google = google;
	}
	public void setGoogleSetup(Boolean googleSetup) {
		this.googleSetup = googleSetup;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setUlti(String ulti) {
		this.ulti = ulti;
	}
	public void setUltiSSOSetup(Boolean ultiSSOSetup) {
		this.ultiSSOSetup = ultiSSOSetup;
	}
	
	
	
	
	
	
}
