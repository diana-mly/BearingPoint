package com.jwt.hibernate.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jwt.hibernate.dao.UserDAO;
import com.mysql.cj.api.jdbc.Statement;

public class UsersControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	//procesam form-ul
        String UserName = request.getParameter("name");
        String UserSurname = request.getParameter("surname");
        String UserEmail = request.getParameter("email");
        String UserPass = request.getParameter("password");
        //cand a fost creat user-ul
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String DateCreated = sdf.format(date);
        //tip utilizator
        int UserType = Integer.parseInt(request.getParameter("admin_rights"));
        //String UserType = request.getParameter("admin_rights");

        HttpSession session = request.getSession(true);
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.registerUsers(UserName, UserSurname, UserEmail, UserPass, DateCreated, UserType);
            response.sendRedirect("index.jsp");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
