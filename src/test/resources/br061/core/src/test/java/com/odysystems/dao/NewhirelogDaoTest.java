package com.odysystems.dao;

import com.odysystems.dao.BaseDaoTestCase;
import com.odysystems.model.Newhirelog;
import org.springframework.dao.DataAccessException;

import static org.junit.Assert.*;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NewhirelogDaoTest extends BaseDaoTestCase {
    @Autowired
    private NewhirelogDao newhirelogDao;

    @Test(expected=DataAccessException.class)
    public void testAddAndRemoveNewhirelog() {
        Newhirelog newhirelog = new Newhirelog();

        // enter all required fields

        log.debug("adding newhirelog...");
        newhirelog = newhirelogDao.save(newhirelog);

        newhirelog = newhirelogDao.get(newhirelog.getId());

        assertNotNull(newhirelog.getId());

        log.debug("removing newhirelog...");

        newhirelogDao.remove(newhirelog.getId());

        // should throw DataAccessException 
        newhirelogDao.get(newhirelog.getId());
    }
}