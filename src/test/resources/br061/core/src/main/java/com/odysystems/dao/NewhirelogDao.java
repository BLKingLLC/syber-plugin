package com.odysystems.dao;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.odysystems.dao.GenericDao;
import com.odysystems.model.Newhirelog;

/**
 * An interface that provides a data management interface to the Newhirelog table.
 */
@Transactional
public interface NewhirelogDao extends GenericDao<Newhirelog, Integer> {

	List<Newhirelog> getDefaultRun();

	List<Newhirelog> getLogsByDate(Date hi, Date lo);

}