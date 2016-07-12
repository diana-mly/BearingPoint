package com.jwt.hibernate.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jwt.hibernate.bean.Users;

public class UserDAO {
	private HttpServletRequest request;
	private   HttpServletResponse response;
	public void registerUsers(String UserName, String UserSurname, String UserEmail, String UserPass,
            String DateCreated, int UserType) {
        try {
        	//instantiem configuratia la Hibernate
            Configuration configuration = new Configuration().configure();
            
            //ne jucam de-a sesiunea
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            
            // Luam un obiect de tip Sesiune
            Session session = sessionFactory.openSession();
            
            // Incepem query
            Transaction transaction = session.beginTransaction();
            System.out.println("yes");
            
            //incepe teroarea
            Users user = new Users();
            user.setUserName(UserName);
            user.setUserSurname(UserSurname);
            user.setUserEmail(UserEmail);
            user.setUserPass(UserPass);
            user.setDateCreated(DateCreated);
            user.setUserType(UserType);
            
            //salvam obiectul User in sesiune
            session.save(user);
            
            //Bagare in baza de date :)
            transaction.commit();
        } catch (HibernateException e) {
        	e.printStackTrace();
        }
    }
	
	public void Login(String email, String password)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); //pai fai ceva :)) da servletu lo deschis sa stii
		//am uitat un caca stai sa mai incerc ceva ):))k
		Transaction papa = null;
		papa = session.beginTransaction();
	   List<Users> ceva = (List<Users>) session.createQuery("from Users where UserEmail = '" + email + "' and UserPass = '" + password + "'").list();
	   papa.commit();
	  //inca o improvizatie sa vedem
	   for (Iterator i = ceva.iterator(); i.hasNext();)
	   {
		   Users current = (Users) i.next();
		   String curPass = current.getUserPass();
		   String curMail = current.getUserEmail();
		   String curName = current.getUserName() + " " + current.getUserSurname();
		   System.out.println("Logged in as: " + current.getUserEmail());
		   if(email == curMail && password == curPass)
		   {
			   
			   try
			   {
				    request.getSession().setAttribute("email", curMail);
				    request.getSession().setAttribute("name", curName);
			   }
			   catch (Exception e) {
		            e.printStackTrace();
		        }
			  
		   }
		   else
		   {

		   }
		   
	   }


	}
	
	public void main (String args[]){
		
		
	} 
}