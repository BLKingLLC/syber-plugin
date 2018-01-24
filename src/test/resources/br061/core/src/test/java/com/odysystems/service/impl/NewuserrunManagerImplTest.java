package com.odysystems.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.odysystems.dao.NewuserrunDao;
import com.odysystems.model.Newhirelog;
import com.odysystems.model.Newuserrun;
import com.odysystems.service.impl.BaseManagerMockTestCase;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

public class NewuserrunManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private NewuserrunManagerImpl manager;

    @Mock
    private NewuserrunDao dao;

    @Test
    public void testGetNewuserrun() {
        log.debug("testing get...");
        //given
        final Integer id = 7;
        final Newuserrun newuserrun = new Newuserrun();
        given(dao.get(id)).willReturn(newuserrun);

        //when
        Newuserrun result = manager.get(id);

        //then
        assertSame(newuserrun, result);
    }

    @Test
    public void testGetNewuserruns() {
        log.debug("testing getAll...");
        //given
        final List<Newuserrun> newuserruns = new ArrayList<>();
        given(dao.getAll()).willReturn(newuserruns);

        //when
        List result = manager.getAll();

        //then
        assertSame(newuserruns, result);
    }

    @Test
    public void testSaveNewuserrun() {
        log.debug("testing save...");

        //given
        final Newuserrun newuserrun = new Newuserrun();
        final Newhirelog newhirelog = new Newhirelog();
        final Set<Newhirelog> newhirelogs = new HashSet<Newhirelog>();
        newhirelogs.add(newhirelog);
        newuserrun.setNewhirelogs(newhirelogs);
        // enter all required fields

        given(dao.save(newuserrun)).willReturn(newuserrun);

        //when
        manager.save(newuserrun);

        //then
        verify(dao).save(newuserrun);
    }

    @Test
    public void testRemoveNewuserrun() {
        log.debug("testing remove...");

        //given
        final Integer id = -11;
        willDoNothing().given(dao).remove(id);

        //when
        manager.remove(id);

        //then
        verify(dao).remove(id);
    }
}
