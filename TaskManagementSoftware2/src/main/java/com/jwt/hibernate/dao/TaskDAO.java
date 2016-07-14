package com.jwt.hibernate.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jwt.hibernate.bean.Tasks;





public class TaskDAO {
	private static final int PriorityID = 0;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public void addTasks(int ProjectID, String TaskTitle, String TaskDescription, int PriotityID, int StatusID, 
			String DateCreated, String DateModified, int creator, int implementer, int tester, int designer)
	{
		try{
			
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            
			Tasks task = new Tasks();
			task.setProjectID(ProjectID);
			task.setTaskTitle(TaskTitle);
			task.setTaskDescription(TaskDescription);
			task.setPriorityID(PriorityID);
			task.setStatusID(StatusID);
			task.setDateCreated(DateCreated);
			task.setDateModified(DateModified);
			task.setCreator(creator);
			task.setImplementer(implementer);
			task.setTester(tester);
			task.setDesigner(designer);
			
			
		    //salvam obiectul Project in sesiune
		    session.save(task);
		    
		    //adaugam in baza de date
		    transaction.commit();
		}
	
    	catch (HibernateException e) {
    		e.printStackTrace();
    	}
	}

}
