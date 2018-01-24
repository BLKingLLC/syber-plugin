package com.odysystems.breerabit.webapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.google.api.services.admin.directory.model.User;
import com.google.api.services.admin.directory.model.UserName;
import com.odysystems.breerabit.webapp.pojo.UltiEmployeeFormList;
import com.odysystems.model.ReturnedUsers;
import com.odysystems.model.UltiPersonModel;
import com.odysystems.service.GoogleUserService;
import com.odysystems.service.UltiProService;
import com.odysystems.soap.EmployeeP;
import com.odysystems.soap.ultipro.employeePerson.Person;

@Controller
public class UltiProController extends BaseFormController{
	private UltiProService ulti = null;
	private GoogleUserService goog = null;
	private Log log = LogFactory.getLog(UltiProController.class);

	public UltiProController() {
        setCancelView("redirect:/home");
        setSuccessView("redirect:/employee/googleInit");
    }
	
	@Autowired
	public void setUlti(UltiProService ulti, GoogleUserService goog) {
		this.ulti = ulti;
		this.goog = goog;
	}
	

    
    @RequestMapping(method = RequestMethod.GET, value="/employee/ultiPro")
    @ModelAttribute(value="ultiUser")
    protected UltiPersonModel showForm(HttpServletRequest request, HttpServletResponse response,
			@RequestParam Map<String, String> requestParams) {
        UltiPersonModel personModel = new UltiPersonModel();
        String empID = requestParams.get("empID");
        if(!StringUtils.isBlank(empID)){
        	personModel.setPerson(ulti.getEmployeeById(empID));
        	personModel.fromPerson(personModel.getPerson());
        return personModel;
        }
        
        personModel.setPerson(new Person());

        
        return personModel;
    }
    
    
    
    @RequestMapping(method = RequestMethod.POST, value="/employee/ultiPro")
    public String onSubmit(@ModelAttribute(value="ultiUser") UltiPersonModel ultiPerson, BindingResult errors, 
    		HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	log.debug("Submitted a POST request");
    	
    	if (request.getParameter("cancel") != null) {
    		saveMessage(request, "Recieved a Cancel Request");
    		return getCancelView();
        }
    	
    	if(request.getParameter("update") != null){
    		log.debug("Updating an employee");
    		String empID = ultiPerson.getEmployeeNumber();
    		Person person = ultiPerson.toPerson();
    		String fullName = person.getFirstName().getValue() + " " + person.getLastNameString();
    		
    		try {
				ulti.udpatePerson(person);
				
				saveMessage(request, "Successfully Updated " + fullName);
			} catch (Exception e) {
				saveError(request, "Failed to update " + fullName);
				e.printStackTrace();
			}
    		
    		return "redirect:ultiPro?empID="+empID;
    		
    	}
    	
    	
    	return null;
    }
}
    	
       