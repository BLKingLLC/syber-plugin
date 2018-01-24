package com.odysystems.service.impl;

import com.odysystems.dao.OrganizationsDao;
import com.odysystems.model.Organizations;
import com.odysystems.service.OrganizationsManager;
import com.odysystems.service.impl.GenericManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.jws.WebService;

@Service("organizationsManager")
@WebService(serviceName = "OrganizationsService", endpointInterface = "com.odysystems.service.OrganizationsManager")
public class OrganizationsManagerImpl extends GenericManagerImpl<Organizations, Integer> implements OrganizationsManager {
    OrganizationsDao organizationsDao;

    @Autowired
    public OrganizationsManagerImpl(OrganizationsDao organizationsDao) {
        super(organizationsDao);
        this.organizationsDao = organizationsDao;
    }
    
    public String getLabel(String orgId){
    	return organizationsDao.getLabel(orgId);
    }
}