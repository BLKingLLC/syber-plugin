package com.odysystems.service;

import java.util.List;
import java.util.Map;

import com.odysystems.exceptions.NullEmailException;
import com.odysystems.exceptions.UserExistsException;
import com.odysystems.soap.EmployeeP;
import com.odysystems.soap.ultipro.SSOuser.SsoUser;
import com.odysystems.soap.ultipro.employeePerson.Person;

public interface UltiProService {
	


	List<EmployeeP> getEmpInfo(Map<String, String> requestParams) throws Exception;
	
	List<SsoUser> synchSSO() throws Exception;
	
	EmployeeP fixEmails (EmployeeP emp)throws UserExistsException, NullEmailException;
	
	void updateEmails (EmployeeP emp, String primary, String alternate);
	
	Person getEmployeeById(String empId);
	
	void provisionSSO(String clientId, String employeeID, String email);
	
	void resetSSO(String employeeID, String clientID);
	
	SsoUser getSsoUser(String employeeID);
	public Boolean ssoConfigured(String employeeID);
	
	public void udpatePerson(Person personToUpdate);
	
	public Boolean isUserEmailCorrect(EmployeeP emp);
	
	public List<EmployeeP> getNewEmployeeInfo(Map<String, String> requestParams);
	
}
