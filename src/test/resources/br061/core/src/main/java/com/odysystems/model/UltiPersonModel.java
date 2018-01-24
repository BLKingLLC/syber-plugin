package com.odysystems.model;

import javax.xml.bind.JAXBElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.odysystems.soap.ultipro.employeePerson.EmployeeIdentifier;
import com.odysystems.soap.ultipro.employeePerson.EmployeeNumberIdentifier;
import com.odysystems.soap.ultipro.employeePerson.ObjectFactory;
import com.odysystems.soap.ultipro.employeePerson.Person;

/**
 * @author cuzimbob Helper Model to convert from Ultipro JAXB elements to
 *         Strings for use in displyaing in JSPs
 */
public class UltiPersonModel {

	private Log log = LogFactory.getLog(UltiPersonModel.class);
	String alternateEmailAddress = new String();
	String emailAddress = new String();
	String firstName = new String();
	String formerLastName = new String();
	String lastName = new String();
	String middleName = new String();
	String preferredFirstName = new String();
	String prefix = new String();
	String employeeNumber = new String();
	String companyCode = new String();
	String ssn = new String();
	String suffix = new String();
	JAXBElement<EmployeeIdentifier> employeeIdentifier;
	EmployeeNumberIdentifier employeeNumberIdentifier;
	Person person;

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}

	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFormerLastName() {
		return formerLastName;
	}

	public void setFormerLastName(String formerLastName) {
		this.formerLastName = formerLastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPreferredFirstName() {
		return preferredFirstName;
	}

	public void setPreferredFirstName(String preferredFirstName) {
		this.preferredFirstName = preferredFirstName;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;

	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public JAXBElement<EmployeeIdentifier> getEmployeeIdentifier() {
		if (employeeIdentifier == null) {
			return this.person.getEmployeeIdentifier();
		}
		return employeeIdentifier;
	}

	public void setEmployeeIdentifier(JAXBElement<EmployeeIdentifier> employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
	}

	public EmployeeNumberIdentifier getEmployeeNumberIdentifier() {
		if (employeeNumberIdentifier == null) {
			return (EmployeeNumberIdentifier) getEmployeeIdentifier().getValue();
		}
		return employeeNumberIdentifier;
	}

	public void setEmployeeNumberIdentifier(EmployeeNumberIdentifier employeeNumberIdentifier) {
		this.employeeNumberIdentifier = employeeNumberIdentifier;
	}

	/*
	 * Helper method to convert from Strings to JAXB Elements for Person
	 */
	public Person toPerson() {
		ObjectFactory factory = new ObjectFactory();
		Person person = new Person();
		person.setAlternateEmailAddress(factory.createPersonAlternateEmailAddress(this.alternateEmailAddress));
		person.setEmailAddress(factory.createPersonEmailAddress(this.emailAddress));
		person.setFirstName(factory.createPersonFirstName(this.firstName));
		person.setFormerLastName(factory.createPersonFormerLastName(this.formerLastName));
		person.setLastName(factory.createPersonLastName(this.lastName));
		person.setMiddleName(factory.createPersonMiddleName(this.middleName));
		person.setPreferredFirstName(factory.createPersonPreferredFirstName(this.preferredFirstName));
		person.setPrefix(factory.createPersonPrefix(this.prefix));
		person.setSSN(factory.createPersonSSN(this.ssn));
		person.setSuffix(factory.createPersonSuffix(this.suffix));

		EmployeeNumberIdentifier empNumId = new EmployeeNumberIdentifier();
		empNumId.setCompanyCode(factory.createEmployeeIdentifierCompanyCode(this.companyCode));
		empNumId.setEmployeeNumber(factory.createEmployeeEmployeeNumber(this.employeeNumber));
		person.setEmployeeIdentifier(factory.createEmployeeIdentifier(empNumId));

		return person;

	}

	public void fromPerson(Person person) {
		this.alternateEmailAddress = person.getAlternateEmailAddress().getValue();
		this.emailAddress = person.getEmailAddress().getValue();
		this.firstName = person.getFirstName().getValue();
		this.lastName = person.getLastName().getValue();
		this.formerLastName = person.getFormerLastName().getValue();
		this.middleName = person.getMiddleName().getValue();
		this.preferredFirstName = person.getPreferredFirstName().getValue();
		this.prefix = person.getPrefix().getValue();
		this.employeeIdentifier = person.getEmployeeIdentifier();
		this.employeeNumberIdentifier = (EmployeeNumberIdentifier) this.employeeIdentifier.getValue();
		this.employeeNumber = getEmployeeNumberIdentifier().getEmployeeNumber().getValue();
		this.companyCode = getEmployeeNumberIdentifier().getCompanyCode().getValue();
		this.ssn = person.getSSN().getValue();
		this.suffix = person.getSuffix().getValue();
	}

}
