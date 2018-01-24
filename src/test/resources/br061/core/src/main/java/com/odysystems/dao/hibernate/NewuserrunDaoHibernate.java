package com.odysystems.dao.hibernate;

import com.odysystems.model.Newuserrun;
import com.odysystems.dao.NewuserrunDao;
import com.odysystems.dao.hibernate.GenericDaoHibernate;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository("newuserrunDao")
public class NewuserrunDaoHibernate extends GenericDaoHibernate<Newuserrun, Integer> implements NewuserrunDao {

    public NewuserrunDaoHibernate() {
        super(Newuserrun.class);
    }
    
    @Override
    public Newuserrun save(Newuserrun object) {
        Session sess = getSession();
        sess.save(object);
        Integer id = object.getId();
        sess.flush();
        
        
        return get(id);
    }
}
