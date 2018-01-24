package com.odysystems.dao;

import com.odysystems.dao.BaseDaoTestCase;
import com.odysystems.model.Organizations;
import org.springframework.dao.DataAccessException;

import static org.junit.Assert.*;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrganizationsDaoTest extends BaseDaoTestCase {
    @Autowired
    private OrganizationsDao organizationsDao;

    @Test(expected=DataAccessException.class)
    public void testAddAndRemoveOrganizations() {
        Organizations organizations = new Organizations();
        organizations.setActive("true");

        // enter all required fields

        log.debug("adding organizations...");
        organizations = organizationsDao.save(organizations);

        organizations = organizationsDao.get(organizations.getId());
        log.debug(organizations);

        assertNotNull(organizations.getId());

        log.debug("removing organizations...");

        organizationsDao.remove(organizations.getId());

        // should throw DataAccessException 
        organizationsDao.get(organizations.getId());
    }
}