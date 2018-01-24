package com.odysystems.soap;

import java.io.Serializable;

import com.odysystems.soap.ultipro.EmployeeInfo.EmploymentInformation;
import com.odysystems.soap.ultipro.EmployeeJob.Job;
import com.odysystems.soap.ultipro.employeeAddress.Address;
import com.odysystems.soap.ultipro.employeePerson.Employee;
import com.odysystems.soap.ultipro.employeePerson.Person;
import com.odysystems.util.XMLGregDateConverter;

public class EmployeeP extends XMLGregDateConverter implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8035128857613378963L;
	Job employeeJob;
	EmploymentInformation employeeInformation;
	Address address;	
	Employee employee;
	Person person;
	
	
	public Job getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(Job employeeJob) {
		this.employeeJob = employeeJob;
	}
	public EmploymentInformation getEmployeeInformation() {
		return employeeInformation;
	}
	public void setEmployeeInformation(EmploymentInformation employeeInformation) {
		this.employeeInformation = employeeInformation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((employeeInformation == null) ? 0 : employeeInformation.hashCode());
		result = prime * result + ((employeeJob == null) ? 0 : employeeJob.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeP other = (EmployeeP) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (employeeInformation == null) {
			if (other.employeeInformation != null)
				return false;
		} else if (!employeeInformation.equals(other.employeeInformation))
			return false;
		if (employeeJob == null) {
			if (other.employeeJob != null)
				return false;
		} else if (!employeeJob.equals(other.employeeJob))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UltiProPojo [employeeJob=" + employeeJob + ", employeeInformation=" + employeeInformation + ", address="
				+ address + ", employee=" + employee + ", person=" + person + "]";
	}
	
	
}