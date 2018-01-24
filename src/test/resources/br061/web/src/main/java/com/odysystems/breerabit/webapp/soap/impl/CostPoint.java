/*package com.odysystems.breerabit.webapp.soap.impl;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Service;

import com.odysystems.breerabit.webapp.soap.CostPointService;
//import com.odysystems.breerabit.webapp.soap.UltiProService;
import com.odysystems.model.Employee;
import com.odysystems.model.soap.costpoint.*;
import com.odysystems.model.soap.costpoint.Odyldmeinfo.LDMEINFOEMPL;
import com.odysystems.service.impl.UltiPro;


@Service("CostPointService")
@WebService(serviceName = "CostPointService", endpointInterface = "com.odysystems.breerabit.webapp.soap.CostPoint")
public class CostPoint extends com.odysystems.service.impl.BaseSoapService<Object> implements CostPointService{

	*/
	/*public void marshalCostpointEMFXML() throws Exception{
		//  Setup the XML Root Element
		Odyldmeinfo root = new Odyldmeinfo();
		//  Go get the employee data
		List<Odyldmeinfo.LDMEINFOEMPL> elList = createCostpointEMF();
		//  Add the employee list to the root element
		root.setLdmeinfoempl(elList);
		//  Setup the XML Object
		String result;
		StringWriter sw = new StringWriter();
		JAXBContext empContext = JAXBContext.newInstance(Odyldmeinfo.class);
		Marshaller empMarshaller = empContext.createMarshaller();
		empMarshaller.marshal(root, sw);
		// Convert the XML Object to an XML Document
		result = sw.toString();
		log.debug("Marshal Results == " + result);
		
	}*/
	
	/*private List<Odyldmeinfo.LDMEINFOEMPL> createCostpointEMF() throws Exception{
		// First go get an employee from UltiPro
		//Employee emp = new Employee();
		UltiPro ulti = new UltiPro();
		
		Map<String, String> params = null;
		params.put("lastName", "King");
		
		List<Employee> emp = ulti.findEmployee(params);
			log.debug("empList size is :: " + emp.size());
		//emp = empList.get(0); 
		// Now Setup a new CP Employee
		
		List<Odyldmeinfo.LDMEINFOEMPL> cpEmpList = new ArrayList<Odyldmeinfo.LDMEINFOEMPL>();
		LDMEINFOEMPL cpEmp = new LDMEINFOEMPL();
		ObjectFactory factory = new ObjectFactory();
		// Get new Checkbox Value

		 for (int i=0; i < emp.size(); i++) {
			// Now set cpEmp = emp where REQUIRED fields are supposed to be equal
			
				//  Set Required CheckBoxes
				cpEmp.setCONTRACTORFL(CheckBox.Y);cpEmp.setCONTRACTORFL(CheckBox.Y);
				cpEmp.setDISABLEDFL(CheckBox.N);
				cpEmp.setELIGAUTOPAYFL(CheckBox.Y);
				cpEmp.setEMPLID(emp.get(i).getPerson().getEmployeeNumber());
				cpEmp.setFIRSTNAME(emp.get(i).getPerson().getFirstName());
				cpEmp.setLASTNAME(emp.get(i).getPerson().getLastName());
				cpEmp.setORIGHIREDT(emp.get(i).getInfo().getOriginalHire());
				//TODO:  Change to real SSN before going live
				cpEmp.setSSNID("123-45-6789");
				//TODO:  Should be a IF/THEN or Switch based on UltiPro Data
				cpEmp.setSEMPLSTATUSCD(CbSEMPLSTATUSCD.ACT);
				cpEmp.setTAXBLEENTITYID("123-45-6789");
				cpEmp.setTSPDCD(emp.get(i).getJob().getPayGroup());
				//TODO:  Should be a IF/THEN or Switch based on UltiPro Data
				cpEmp.setUNIONEMPLFL(CheckBox.N);
			
			// Now Add the other Fields
				
			
			//  Add the pojo to the list
			cpEmpList.add(cpEmp);
		 }

				
		return cpEmpList;
	}*/



