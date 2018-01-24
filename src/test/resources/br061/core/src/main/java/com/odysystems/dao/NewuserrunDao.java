package com.odysystems.dao;

import org.springframework.transaction.annotation.Transactional;

import com.odysystems.dao.GenericDao;

import com.odysystems.model.Newuserrun;

/**
 * An interface that provides a data management interface to the Newuserrun table.
 */

public interface NewuserrunDao extends GenericDao<Newuserrun, Integer> {

	
	@Override
	@Transactional
    public Newuserrun save(Newuserrun object);
}