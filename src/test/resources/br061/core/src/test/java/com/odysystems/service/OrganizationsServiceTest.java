package com.odysystems.service;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrganizationsServiceTest extends BaseManagerTestCase {
    private Log log = LogFactory.getLog(OrganizationsServiceTest.class);
    @Autowired
    private OrganizationsManager manager;


    @Test
    public void testGetLabel() {
    	String orgId = "1313";
    	
        String response = manager.getLabel(orgId);
        log.debug(response);
        assertNotNull(response);
        
    }
    
   

}
