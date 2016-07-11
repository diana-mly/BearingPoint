package com.jwt.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jwt.hibernate.bean.Users;

public class UserDAO {
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
}