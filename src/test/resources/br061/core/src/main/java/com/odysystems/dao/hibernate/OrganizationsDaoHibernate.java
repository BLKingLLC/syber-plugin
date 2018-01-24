package com.odysystems.dao.hibernate;

import com.odysystems.model.Organizations;
import com.odysystems.dao.OrganizationsDao;
import com.odysystems.dao.hibernate.GenericDaoHibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("organizationsDao")
public class OrganizationsDaoHibernate extends GenericDaoHibernate<Organizations, Integer> implements OrganizationsDao {

    public OrganizationsDaoHibernate() {
        super(Organizations.class);
    }
    
    public String getLabel(String orgId){
    	Criteria cr = getSession().createCriteria(Organizations.class);
    	cr.add(Restrictions.eq("code", orgId));
    	cr.add(Restrictions.eq("active", "TRUE"));
    	List<Organizations> results = cr.list();
    	String label = results.get(0).getName();
    	return label;
    }
}
