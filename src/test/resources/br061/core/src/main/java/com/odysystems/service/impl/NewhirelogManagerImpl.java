package com.odysystems.service.impl;

import com.odysystems.dao.NewhirelogDao;
import com.odysystems.model.Newhirelog;
import com.odysystems.service.NewhirelogManager;
import com.odysystems.service.impl.GenericManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import javax.jws.WebService;

@Service("newhirelogManager")
@WebService(serviceName = "NewhirelogService", endpointInterface = "com.odysystems.service.NewhirelogManager")
public class NewhirelogManagerImpl extends GenericManagerImpl<Newhirelog, Integer> implements NewhirelogManager {
    NewhirelogDao newhirelogDao;

    @Autowired
    public NewhirelogManagerImpl(NewhirelogDao newhirelogDao) {
        super(newhirelogDao);
        this.newhirelogDao = newhirelogDao;
    }

	@Override
	public List<Newhirelog> getDefaultRun() {
		return newhirelogDao.getDefaultRun();
	}

	@Override
	public List<Newhirelog> getLogsByDate(Date hi, Date lo) {
		return newhirelogDao.getLogsByDate(hi, lo);
	}
}