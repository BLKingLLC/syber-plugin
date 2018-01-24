package com.odysystems.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReturnedUsers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 61525268355948724L;
	
	
	List<com.google.api.services.admin.directory.model.User> users = new ArrayList<com.google.api.services.admin.directory.model.User>();
	Integer completed;
	Integer existed;
	Integer unknownOU;
	List<EmployeeList> employees = new ArrayList<EmployeeList>();
	
	public List<EmployeeList> getEmployees(){
		return employees;
	}
	public void setEmployees(List<EmployeeList> employees){
		this.employees = employees;
	}
	
	public List<com.google.api.services.admin.directory.model.User> getUsers() {
		return users;
	}
	public void setUsers(List<com.google.api.services.admin.directory.model.User> newUsers) {
		this.users = newUsers;
	}
	public Integer getCompleted() {
		return completed;
	}
	public void setCompleted(Integer completed) {
		this.completed = completed;
	}
	public Integer getExisted() {
		return existed;
	}
	public void setExisted(Integer existed) {
		this.existed = existed;
	}
	public Integer getUnknownOU() {
		return unknownOU;
	}
	public void setUnknownOU(Integer unknownOU) {
		this.unknownOU = unknownOU;
	}
	
	
	
	
}
