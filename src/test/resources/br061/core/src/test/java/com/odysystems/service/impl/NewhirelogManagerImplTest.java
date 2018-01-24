package com.odysystems.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.odysystems.dao.NewhirelogDao;
import com.odysystems.model.Newhirelog;
import com.odysystems.service.impl.BaseManagerMockTestCase;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

public class NewhirelogManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private NewhirelogManagerImpl manager;

    @Mock
    private NewhirelogDao dao;

    @Test
    public void testGetNewhirelog() {
        log.debug("testing get...");
        //given
        final Integer id = 7;
        final Newhirelog newhirelog = new Newhirelog();
        given(dao.get(id)).willReturn(newhirelog);

        //when
        Newhirelog result = manager.get(id);

        //then
        assertSame(newhirelog, result);
    }

    @Test
    public void testGetNewhirelogs() {
        log.debug("testing getAll...");
        //given
        final List<Newhirelog> newhirelogs = new ArrayList<>();
        given(dao.getAll()).willReturn(newhirelogs);

        //when
        List result = manager.getAll();

        //then
        assertSame(newhirelogs, result);
    }

    @Test
    public void testSaveNewhirelog() {
        log.debug("testing save...");

        //given
        final Newhirelog newhirelog = new Newhirelog();
        // enter all required fields

        given(dao.save(newhirelog)).willReturn(newhirelog);

        //when
        manager.save(newhirelog);

        //then
        verify(dao).save(newhirelog);
    }

    @Test
    public void testRemoveNewhirelog() {
        log.debug("testing remove...");

        //given
        final int id = -11;
        willDoNothing().given(dao).remove(id);

        //when
        manager.remove(id);

        //then
        verify(dao).remove(id);
    }
}
