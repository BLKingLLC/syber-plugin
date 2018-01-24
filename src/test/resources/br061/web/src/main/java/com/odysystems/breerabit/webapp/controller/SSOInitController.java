package com.odysystems.breerabit.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.api.services.admin.directory.model.User;
import com.odysystems.service.GoogleUserService;

@Controller
@RequestMapping("/employee/ssoInfo*")
public class SSOInitController extends BaseFormController{

	private GoogleUserService goog;
	
/*	public SSOInitController() {
        setCancelView("redirect:/home");
        setSuccessView("redirect:/employee/ssoInfo");
    }*/
	
	
	@Autowired
	public void setUserService(GoogleUserService goog){
		this.goog = goog;
	}
	
    @RequestMapping(method = RequestMethod.GET)
    public Model handleRequest(@RequestParam(required = false, value = "email") String email)
    throws Exception {
        Model model = new ExtendedModelMap();
        log.debug("I'm in the controller");
        log.debug("Received param of :: " + email);
        if(!StringUtils.isBlank(email)){
        	List<User> users = new ArrayList<User>();
        	User user = goog.getUserByEmail(email);
        	users.add(user);
        	model.addAttribute("userInfo", users);
        	return model;
        }
        

        return model;
    }
}
