package com.odysystems.service.impl;

import com.odysystems.dao.NewuserrunDao;
import com.odysystems.model.Newuserrun;
import com.odysystems.service.NewuserrunManager;
import com.odysystems.service.impl.GenericManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.jws.WebService;

@Service("newuserrunManager")
@WebService(serviceName = "NewuserrunService", endpointInterface = "com.odysystems.service.NewuserrunManager")
public class NewuserrunManagerImpl extends GenericManagerImpl<Newuserrun, Integer> implements NewuserrunManager {
    NewuserrunDao newuserrunDao;

    @Autowired
    public NewuserrunManagerImpl(NewuserrunDao newuserrunDao) {
        super(newuserrunDao);
        this.newuserrunDao = newuserrunDao;
    }
}