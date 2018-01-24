package com.odysystems.breerabit.webapp.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.odysystems.soap.EmployeeP;

public class UltiEmployeeFormList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1444983412872207589L;
	List<EmployeeP> employees = new ArrayList<EmployeeP>();

	public List<EmployeeP> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeP> employees) {
		this.employees = employees;
	}
	

}
