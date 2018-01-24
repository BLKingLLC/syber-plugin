package com.odysystems.service;

import com.odysystems.service.GenericManager;
import com.odysystems.model.Organizations;

import java.util.List;
import javax.jws.WebService;

@WebService
public interface OrganizationsManager extends GenericManager<Organizations, Integer> {
    
	public String getLabel(String orgId);
}