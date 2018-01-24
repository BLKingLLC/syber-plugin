package com.odysystems.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.odysystems.dao.OrganizationsDao;
import com.odysystems.model.Organizations;
import com.odysystems.service.impl.BaseManagerMockTestCase;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

public class OrganizationsManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private OrganizationsManagerImpl manager;

    @Mock
    private OrganizationsDao dao;
    
    @Test
    public void testGetOrganizations() {
        log.debug("testing get...");
        //given
        final Integer id = 7;
        final Organizations organizations = new Organizations();
        given(dao.get(id)).willReturn(organizations);

        //when
        Organizations result = manager.get(id);

        //then
        assertSame(organizations, result);
    }

    @Test
    public void testGetOrganizationss() {
        log.debug("testing getAll...");
        //given
        final List<Organizations> organizationss = new ArrayList<>();
        given(dao.getAll()).willReturn(organizationss);

        //when
        List result = manager.getAll();

        //then
        assertSame(organizationss, result);
    }

    @Test
    public void testSaveOrganizations() {
        log.debug("testing save...");

        //given
        final Organizations organizations = new Organizations();
        // enter all required fields

        given(dao.save(organizations)).willReturn(organizations);

        //when
        manager.save(organizations);

        //then
        verify(dao).save(organizations);
    }

    @Test
    public void testRemoveOrganizations() {
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
