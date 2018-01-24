package com.odysystems.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.api.services.admin.directory.model.User;
import com.odysystems.exceptions.NullEmailException;
import com.odysystems.exceptions.UserExistsException;
import com.odysystems.service.impl.GoogleUserServiceImpl;
import com.odysystems.service.impl.UltiProServiceImpl;
import com.odysystems.soap.EmployeeP;
import com.odysystems.soap.ultipro.SSOuser.SsoUser;
import com.odysystems.soap.ultipro.employeePerson.ObjectFactory;
import com.odysystems.soap.ultipro.employeePerson.Person;

public class UltiProServiceTest extends BaseManagerTestCase {
    private Log log = LogFactory.getLog(UltiProServiceTest.class);
    @Autowired
    private UltiProServiceImpl ultipro;
    
    @Autowired
    private GoogleUserServiceImpl goog;



    @Test
     public void testGetEmployeeById() throws Exception {
		Map<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("empId", "002006");
		List<EmployeeP> empInfo = new ArrayList<EmployeeP>();
		empInfo = ultipro.getEmpInfo(requestParams);
		EmployeeP response = empInfo.get(0);
		String id = response.getEmployee().getEmployeeNumber().getValue();
		log.debug(id);
        assertTrue(id.equals("002006"));
        
        
    }
    
    @Test
    public void testGetEmployeeByHireDate() throws Exception {
		Map<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("beginDate", "2017-02-01");
		requestParams.put("endDate", "2017-03-01");
		List<EmployeeP> empInfo = new ArrayList<EmployeeP>();
		empInfo = ultipro.getEmpInfo(requestParams);
		EmployeeP response = empInfo.get(0);
        assertNotNull(response.getEmployee().getEmployeeNumber().getValue());
        log.debug(response.getEmployee().getEmployeeNumber().getValue());
        
    }

   
    
    //Test Fix -- Personal in Alternate
    @Test
    public void testFixEmailsPersonalInAlternate() throws UserExistsException, NullEmailException{
    	//Peresonal in Primary.  Alternate null
    	// Expected outcome is that Primary == null and Alternate == personal
    	//Create an employee factory
    	ObjectFactory employeeFactory = new ObjectFactory();
    	//Create a Person
    	Person person = new Person();
    	String primary = new String();
    	String alternate = new String();
    	person.setEmailAddress(employeeFactory.createPersonEmailAddress(new String()));
    	person.setAlternateEmailAddress(employeeFactory.createPersonAlternateEmailAddress("bobby.king@blking.net"));
    	EmployeeP emp = new EmployeeP();
    	emp.setPerson(person);
    	EmployeeP returnedEmp = ultipro.fixEmails(emp);
    	primary = returnedEmp.getPerson().getEmailAddress().getValue();
    	alternate = returnedEmp.getPerson().getAlternateEmailAddress().getValue();
    	log.debug("Primary Email is :: " + primary);
    	log.debug("Alternate Email is :: " + alternate);
    	assertTrue(primary.isEmpty() && alternate.equals("bobby.king@blking.net"));
    }
    //Test Fix -- Either Contains ODY
    @Test
    public void testFixEmailContainsODY(){
    	//Peresonal in Primary.  Alternate null
    	// Expected outcome is that Primary == null and Alternate == personal
    	//Create an employee factory
    	ObjectFactory employeeFactory = new ObjectFactory();
    	//Create a Person
    	Person person = new Person();
    	person.setEmailAddress(employeeFactory.createPersonEmailAddress(new String()));
    	person.setAlternateEmailAddress(employeeFactory.createPersonAlternateEmailAddress("bobby.king@odysseyconsult.com"));
    	
    	EmployeeP emp = new EmployeeP();
    	emp.setPerson(person);
    	
    	@SuppressWarnings("unused")
		EmployeeP returnedEmp = new EmployeeP();
		try {
			returnedEmp = ultipro.fixEmails(emp);
		} catch (UserExistsException e) {
			log.debug(e.getMessage());
			assertFalse(1 == 2);
		} catch (NullEmailException e) {
			log.debug(e.getMessage());
			assertTrue(1 == 2);
		}
		
    	person.setEmailAddress(employeeFactory.createPersonEmailAddress("bobby.king@odysseyconsult.com"));
    	person.setAlternateEmailAddress(employeeFactory.createPersonAlternateEmailAddress(new String()));
    	
    	emp.setPerson(person);
    	
    	@SuppressWarnings("unused")
		EmployeeP returnedEmp2 = new EmployeeP();
		try {
			returnedEmp = ultipro.fixEmails(emp);
		} catch (UserExistsException e) {
			log.debug(e.getMessage());
			assertFalse(1 == 2);
		} catch (NullEmailException e) {
			log.debug(e.getMessage());
			assertTrue(1 == 2);
		}
    	
    }
    
    @Test
    public void testFixEmailsPersonalInPrimary() throws UserExistsException, NullEmailException{
    	//Peresonal in Primary.  Alternate null
    	// Expected outcome is that Primary == null and Alternate == personal
    	//Create an employee factory
    	ObjectFactory employeeFactory = new ObjectFactory();
    	//Create a Person
    	Person person = new Person();
    	String primary = new String();
    	String alternate = new String();
    	person.setEmailAddress(employeeFactory.createPersonEmailAddress("bobby.king@blking.net"));
    	person.setAlternateEmailAddress(employeeFactory.createPersonAlternateEmailAddress(new String()));
    	EmployeeP emp = new EmployeeP();
    	emp.setPerson(person);
    	EmployeeP returnedEmp = ultipro.fixEmails(emp);
    	primary = returnedEmp.getPerson().getEmailAddress().getValue();
    	alternate = returnedEmp.getPerson().getAlternateEmailAddress().getValue();
    	log.debug("Primary Email is :: " + primary);
    	log.debug("Alternate Email is :: " + alternate);
    	assertTrue(primary.isEmpty() && alternate.equals("bobby.king@blking.net"));
    }
    
    @Test
    public void testGetPersonByEmployeeId(){
    	Person person = ultipro.getEmployeeById("696969");
    	String name = person.getLastName().getValue().toLowerCase();
    	assertTrue(name.contains("test"));
    }
    
    @Test
    public void testUpdateEmails(){
    	EmployeeP emp = new EmployeeP();
    	Person person = ultipro.getEmployeeById("696969");
    	String origAlt = person.getAlternateEmailAddress().getValue();
    	String primary = "bobbyking@odysseyconsult.com";
    	String alternate;
    	
    	if(origAlt != null){
	    	if(origAlt.equals("bobby.king@blking.net")){
	    		alternate = "cuzimbob@gmail.com";
	    	}
	    	else{alternate = "bobby.king@blking.net";}
    	}
    	else{alternate = "bobby.king@blking.net";}
    	
    	emp.setPerson(person);
    	ultipro.updateEmails(emp, primary, alternate);
    	
    	Person updatedPerson = ultipro.getEmployeeById("696969");
    	assertTrue(updatedPerson.getAlternateEmailAddress().getValue().contains(alternate));
    	
    	
    }
    
    @Test
    public void testGetSSOUser(){
    	SsoUser ssoUser = ultipro.getSsoUser("696969");
    	assertNotNull(ssoUser.getActivationKey());
    	
    }
    
    
    @Test
    public void testProvisionSSO(){
    	User user = null;
		try {
			user = goog.getUserByEmail("bobbyking@odysseyconsult.com");
		} catch (Exception e) {
		log.debug("caught an error");
		}
    	
    	String clientId = user.getId();
    	String email = "McTestersonT";
    	String employeeID = "696969";

    	//Make sure suer is not provisioned already
    	if(ultipro.getSsoUser("696969") != null){
    		ultipro.resetSSO("696969", clientId);
    	}
    	
    	
    	ultipro.provisionSSO(clientId, employeeID, email);
    
    	SsoUser ssoUser = ultipro.getSsoUser("696969");
    	assertNotNull(ssoUser.getActivationKey());
    }
    
    @Test
    public void testResetSSO(){
    	User user = null;
		
    	try {
			user = goog.getUserByEmail("bobbyking@odysseyconsult.com");
		} catch (Exception e) {
		log.debug("caught an error");
		}
    	
    	String clientId = user.getId();
    	
    	ultipro.resetSSO("696969", clientId);
    	assertNull(ultipro.getSsoUser("696969"));
    	
    }
    
}
