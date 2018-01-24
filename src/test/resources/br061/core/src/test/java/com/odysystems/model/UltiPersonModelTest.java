package com.odysystems.model;

import static org.junit.Assert.assertTrue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;

import com.odysystems.soap.ultipro.employeePerson.EmployeeNumberIdentifier;
import com.odysystems.soap.ultipro.employeePerson.ObjectFactory;
import com.odysystems.soap.ultipro.employeePerson.Person;

public class UltiPersonModelTest {
	
	private Log log = LogFactory.getLog(UltiPersonModelTest.class);
	
	ObjectFactory factory = new ObjectFactory();
	Person person = new Person();
	private static final String EMAIL = "bobbyking@odysseyconsult.com";
	private static final String FIRST = "bobby";
	private static final String LAST = "king";
	private static final String MIDDLE = "lee";
	private static final String PREFIX = "Mr.";
	private static final String COCODE = "ODY";
	private static final String NUMBER = "696969";
	
	@Before
	public void setPerson(){
		
		EmployeeNumberIdentifier employeeNumberIdentifier = new EmployeeNumberIdentifier();
		employeeNumberIdentifier.setCompanyCode(factory.createEmployeeCompanyCode(COCODE));
		employeeNumberIdentifier.setEmployeeNumber(factory.createEmployeeNumberIdentifierEmployeeNumber(NUMBER));
		person.setEmployeeIdentifier(factory.createEmployeeIdentifier(employeeNumberIdentifier));
		
		person.setAlternateEmailAddress(
				factory.createPersonAlternateEmailAddress(EMAIL));
		person.setEmailAddress(
				factory.createPersonEmailAddress(EMAIL));
		person.setFirstName(
				factory.createPersonFirstName(FIRST));
		person.setFormerLastName(
				factory.createPersonFormerLastName(LAST));
		person.setLastName(
				factory.createPersonLastName(LAST));
		person.setMiddleName(
				factory.createPersonMiddleName(MIDDLE));
		person.setPreferredFirstName(
				factory.createPersonPreferredFirstName(FIRST));
		person.setPrefix(
				factory.createPersonPrefix(PREFIX));
	}
	


/*	@Test
	public void testPersonToStrings(){
		UltiPersonModel ultiPerson = new UltiPersonModel();
		ultiPerson.setPerson(person);
		assertTrue(ultiPerson.getAlternateEmailAddress().equals(EMAIL));
		assertTrue(ultiPerson.getEmailAddress().equals(EMAIL));
		assertTrue(ultiPerson.getFirstName().equals(FIRST));
		assertTrue(ultiPerson.getFormerLastName().equals(LAST));
		assertTrue(ultiPerson.getLastName().equals(LAST));
		assertTrue(ultiPerson.getMiddleName().equals(MIDDLE));
		assertTrue(ultiPerson.getPreferredFirstName().equals(FIRST));
		assertTrue(ultiPerson.getPrefix().equals(PREFIX));
	}*/

	@Test
	public void testStringsToPerson(){
		UltiPersonModel ultiPerson = new UltiPersonModel();
		ultiPerson.setAlternateEmailAddress(EMAIL);
		ultiPerson.setEmailAddress(EMAIL);
		ultiPerson.setFirstName(FIRST);
		ultiPerson.setFormerLastName(LAST);
		ultiPerson.setLastName(LAST);
		ultiPerson.setMiddleName(MIDDLE);
		ultiPerson.setPreferredFirstName(FIRST);
		ultiPerson.setPrefix(PREFIX);
		Person person = ultiPerson.toPerson();
		assertTrue(person.getAlternateEmailAddress().getValue().equals(EMAIL));
		assertTrue(person.getEmailAddress().getValue().equals(EMAIL));
		assertTrue(person.getFirstName().getValue().equals(FIRST));
		assertTrue(person.getFormerLastName().getValue().equals(LAST));
		assertTrue(person.getLastName().getValue().equals(LAST));
		assertTrue(person.getMiddleName().getValue().equals(MIDDLE));
		assertTrue(person.getPreferredFirstName().getValue().equals(FIRST));
		assertTrue(person.getPrefix().getValue().equals(PREFIX));
	}
	
	@Test 
	public void testGetEmployeeIdentifier(){
		UltiPersonModel ultiPerson = new UltiPersonModel();
		ultiPerson.setPerson(person);
		assertTrue(ultiPerson.getCompanyCode().equals(COCODE));
		assertTrue(ultiPerson.getEmployeeNumber().equals(NUMBER));
		
	}
	
	@Test
	public void testSetEmployeeIdentifier(){
		UltiPersonModel ultiPerson = new UltiPersonModel();
		ultiPerson.setCompanyCode(COCODE);
		ultiPerson.setEmployeeNumber(NUMBER);
		Person person = ultiPerson.toPerson();
		EmployeeNumberIdentifier eid = new EmployeeNumberIdentifier();
		eid = (EmployeeNumberIdentifier) person.getEmployeeIdentifier().getValue();
		assertTrue(eid.getCompanyCode().getValue().equals(COCODE));
		assertTrue(eid.getEmployeeNumber().getValue().equals(NUMBER));
	}
	
	@Test
	public void testFromPerson(){
		UltiPersonModel ultiPerson = new UltiPersonModel();
		ultiPerson.fromPerson(person);
		assertTrue(ultiPerson.getFirstName().equals(FIRST));
		assertTrue(ultiPerson.getEmployeeNumber().equals(NUMBER));
	}
	
}