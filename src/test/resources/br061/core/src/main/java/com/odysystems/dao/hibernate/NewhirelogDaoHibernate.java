package com.odysystems.dao.hibernate;

import com.odysystems.model.Newhirelog;
import com.odysystems.model.Newuserrun;
import com.odysystems.dao.NewhirelogDao;
import com.odysystems.dao.hibernate.GenericDaoHibernate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("newhirelogDao")
public class NewhirelogDaoHibernate extends GenericDaoHibernate<Newhirelog, Integer> implements NewhirelogDao {

    public NewhirelogDaoHibernate() {
        super(Newhirelog.class);
    }

	@Override
	public List<Newhirelog> getDefaultRun() {
		Date hi = new Date(System.currentTimeMillis()); //Set todays date
		//Get the Date for 5 days ago
		Calendar cal = Calendar.getInstance();
		cal.setTime(hi);
		cal.add(Calendar.DATE, -5);
		Date lo = cal.getTime(); //date is 5 days ago
				
		return getLogsByDate(hi, lo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Newhirelog> getLogsByDate(Date hi, Date lo) {
		Criteria cr = getSession().createCriteria(Newuserrun.class);
		cr.add(Restrictions.between("date", lo, hi)); // Get all runs from the last 5 days
		List<Newuserrun> runList = cr.list();
		Set<Newhirelog> logCol = new HashSet<Newhirelog>();
		List<Newhirelog> logList = new ArrayList<Newhirelog>();
		for(Newuserrun run : runList) { //extract Newhirelogs from runs
			logCol.addAll(run.getNewhirelogs());
		}
		Iterator<Newhirelog> logIt = logCol.iterator();
		while(logIt.hasNext()) {
			logList.add(logIt.next()); // convert Set to List
		}
		
		return logList;
	}
    
    
}
