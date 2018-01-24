package com.odysystems.service;

import com.odysystems.service.GenericManager;
import com.odysystems.model.Newhirelog;

import java.util.Date;
import java.util.List;
import javax.jws.WebService;

@WebService
public interface NewhirelogManager extends GenericManager<Newhirelog, Integer> {

	List<Newhirelog> getDefaultRun();

	List<Newhirelog> getLogsByDate(Date hi, Date lo);
    
}