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

import com.jwt.hibernate.dao.TaskDAO;;


public class TasksControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	
    	//procesam form-ul
    	String TaskTitle = request.getParameter("taskTitle");
    	String TaskDescription = request.getParameter("taskDescription");
    	String ProjectDescription = request.getParameter("projectDescription");
    	int Creator = Integer.parseInt(request.getParameter("creator"));
    	int Implementer = Integer.parseInt(request.getParameter("implementer"));
    	int Tester = Integer.parseInt(request.getParameter("tester"));
    	int Designer = Integer.parseInt(request.getParameter("designer"));
    	    	
        //cand a fost creat task`ul
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String DateCreated = sdf.format(date);
        String DateModified = sdf.format(date);
        
        HttpSession session = request.getSession(true);
        try {
        	TaskDAO taskDAO = new TaskDAO();
			taskDAO.addTasks(Integer.parseInt(null), TaskTitle, TaskDescription, Integer.parseInt(null), Integer.parseInt(null), DateCreated, DateModified, Creator, Implementer, Tester, Designer);
            response.sendRedirect("index.jsp");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}