package com.odysystems.breerabit.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.api.client.http.HttpResponseException;
import com.odysystems.service.GoogleUserService;
import com.odysystems.service.UltiProService;

@Controller
@RequestMapping("/employee/ssoSynch*")
public class SSOSynchController extends BaseFormController{

	private UltiProService ulti;
	
	@Autowired
	public void setUserService(UltiProService ulti){
		this.ulti = ulti;
	}
	
    @RequestMapping(method = RequestMethod.GET)
    public Model handleRequest()
    throws Exception {
        Model model = new ExtendedModelMap();
        	
				model.addAttribute(ulti.synchSSO());

        return model;
    }
}
