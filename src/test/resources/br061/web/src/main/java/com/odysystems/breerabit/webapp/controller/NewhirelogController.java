package com.odysystems.breerabit.webapp.controller;

import com.odysystems.service.NewhirelogManager;
import com.odysystems.model.Newhirelog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee/newhirelogs*")
public class NewhirelogController extends BaseFormController{
    private NewhirelogManager newhirelogManager;

    @Autowired
    public void setNewhirelogManager(NewhirelogManager newhirelogManager) {
        this.newhirelogManager = newhirelogManager;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Model handleRequest(final HttpServletRequest request,
    		@RequestParam(required = false, value = "q") String query,
    		@RequestParam(required = false, value = "beginDate") String beginDate,
    		@RequestParam(required = false, value = "endDate") String endDate
    		)
    throws Exception {
        Model model = new ExtendedModelMap();

        log.debug("hadling the request");
        
        if((beginDate != null && !beginDate.isEmpty()) || (endDate != null && !endDate.isEmpty())) {
        	log.debug("dates were not null");
        	
        	Date hi = stringToDate(endDate);
        	Date lo = stringToDate(beginDate);
        	
        	try {
				model.addAttribute(newhirelogManager.getLogsByDate(hi, lo));
			} catch (Exception e) {
				saveError(request, "Something went wrong while retrieving NewHire Logs by date range");
				log.debug(e.getMessage());
				model.addAttribute(newhirelogManager.getDefaultRun());
				
				
			}
        	return model;
        }
        
        if(query != null && !query.isEmpty()) {
        	log.debug("Query was not null");
        	try {
				model.addAttribute(newhirelogManager.search(query, Newhirelog.class));
			} catch (Exception e) {
				saveError(request, "Something went wrong while retrieving NewHire Logs with search terms");
				log.debug(e.getMessage());
				model.addAttribute(newhirelogManager.getDefaultRun());
			}
        	
        	return model;
        }
        
        log.debug("No matched request params");
        model.addAttribute(newhirelogManager.getDefaultRun()); // all request params were null so get the default run.
        return model;
    }
    
    private Date stringToDate(String dateString) {
    	DateFormat formatter = new SimpleDateFormat("yyy-MM-dd");
    	Date date = new Date();
    	try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	
    	return date;
    }
}
