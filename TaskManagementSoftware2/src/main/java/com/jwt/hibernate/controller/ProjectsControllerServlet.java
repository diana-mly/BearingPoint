package com.jwt.hibernate.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jwt.hibernate.dao.ProjectDAO;

public class ProjectsControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	
    	//procesam form-ul
    	String ProjectName = request.getParameter("projectName");
    	String ProjectManager = request.getParameter("projectManager");
    	String ProjectDescription = request.getParameter("projectDescription");
    	
        //cand a fost creat proiectul
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String DateCreated = sdf.format(date);
        
        //tip utilizator
        //int UserType = Integer.parseInt(request.getParameter("admin_rights"));

        HttpSession session = request.getSession(true);
        try {
            ProjectDAO projectDAO = new ProjectDAO();
            projectDAO.addProjects(1, ProjectName, ProjectManager, ProjectDescription, DateCreated);
            response.sendRedirect("index.jsp");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}