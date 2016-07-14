package com.jwt.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.*;
import javax.servlet.*;

import com.jwt.hibernate.bean.Users;
import com.jwt.hibernate.dao.UserDAO;
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//luam din campuri
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//verificam sa nu fie campuri goale
		if(!email.isEmpty() && !password.isEmpty())
		{
			UserDAO prayers = new UserDAO();
			try {
				prayers.Login(email, password);
				response.sendRedirect("projectsList.jsp");
			}
			catch (Exception e) {
	            e.printStackTrace();
	        }
		}
	}

}
