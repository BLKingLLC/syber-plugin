package com.odysystems.dao;

import com.odysystems.dao.BaseDaoTestCase;
import com.odysystems.model.Newhirelog;
import com.odysystems.model.Newuserrun;
import org.springframework.dao.DataAccessException;

import static org.junit.Assert.*;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NewuserrunDaoTest extends BaseDaoTestCase {
    @Autowired
    private NewuserrunDao newuserrunDao;

    @Test
    //@Test(expected=DataAccessException.class)
    public void testAddAndRemoveNewuserrun() {
        Newuserrun newuserrun = new Newuserrun();
        final Newhirelog newhirelog = new Newhirelog();
        newhirelog.setNewuserrun(newuserrun);
        final Set<Newhirelog> newhirelogs = new HashSet<Newhirelog>();
        newhirelogs.add(newhirelog);
        newuserrun.setNewhirelogs(newhirelogs);

        // enter all required fields

        log.debug("adding newuserrun...");
        newuserrun = newuserrunDao.save(newuserrun);

        newuserrun = newuserrunDao.get(newuserrun.getId());
        log.debug(newuserrun.getNewhirelogs().iterator().next().toString());
        assertNotNull(newuserrun.getId());

        /*log.debug("removing newuserrun...");

        newuserrunDao.remove(newuserrun.getId());

        // should throw DataAccessException 
        newuserrunDao.get(newuserrun.getId());*/
    }
}