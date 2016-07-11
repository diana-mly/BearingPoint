<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

<% String email = request.getParameter("email"); %>

<% if(email != null){ 
	out.print("You are logged in as: " + email); %>

	<form name="logoutForm" method="post" action="LogoutServlet">
    	<input type="submit" value="Logout" />
	</form>
<%
	}
%>

</body>
</html>