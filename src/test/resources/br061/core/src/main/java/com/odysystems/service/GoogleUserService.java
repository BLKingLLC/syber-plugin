package com.odysystems.service;


import java.util.List;

import javax.jws.WebService;

import com.google.api.services.admin.directory.model.User;
import com.odysystems.exceptions.UserExistsException;
import com.odysystems.model.Newuserrun;
import com.odysystems.model.ReturnedUsers;
import com.odysystems.service.impl.GoogleUserException;
import com.odysystems.soap.EmployeeP;


@WebService
public interface GoogleUserService {

	public User getUserByEmail(String user);	
	
	public User createUser(String first, String last, String email) throws GoogleUserException;
	public void deleteUser(String email);
	public User createUser(EmployeeP ultiNewHire)throws UserExistsException, GoogleUserException;
	public Newuserrun createUser(List<EmployeeP> employees) throws GoogleUserException;
	public User createUser(User user) throws GoogleUserException;
	public User updateUser(User user);
	public boolean userExist(String email);
	public void sendWelcomeEmail(final String username, final String empID, final EmployeeP ultiEmp);
}
