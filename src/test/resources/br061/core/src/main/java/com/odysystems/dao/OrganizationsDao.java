package com.odysystems.dao;

import com.odysystems.dao.GenericDao;

import com.odysystems.model.Organizations;

/**
 * An interface that provides a data management interface to the Organizations table.
 */
public interface OrganizationsDao extends GenericDao<Organizations, Integer> {

	String getLabel(String orgId);
	
}