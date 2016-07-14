package com.jwt.hibernate.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jwt.hibernate.bean.Projects;

public class ProjectDAO {
	private HttpServletRequest request;
	private   HttpServletResponse response;
	
	public void addProjects(int ReleaseID, String ProjectName, String ProjectManager, String ProjectDescription, String DateCreated)
	{
		try{
			
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            
			Projects project = new Projects();
			project.setReleaseID(ReleaseID);
			project.setProjectName(ProjectName);
			project.setProjectManager(ProjectManager);
			project.setProjectDescription(ProjectDescription);
			project.setDateCreated(DateCreated);
			
		    //salvam obiectul Project in sesiune
		    session.save(project);
		    
		    //adaugam in baza de date
		    transaction.commit();
		}
	
    	catch (HibernateException e) {
    		e.printStackTrace();
    	}
	}
}

