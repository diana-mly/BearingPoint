<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="addForm" method="POST" action="ProjectsControllerServlet">
	Project name: <br> <input required type="text" name="projectName"/> <br/>
	<br>
	Project Manager: <br> <input required type="text" name="projectManager"/> <br/>
	<br>
    Project description:<br> <input required type="text" name="projectDescription"/> <br/>
    <br>
    <input type="submit" value="Add" />
</form>

</body>
</html>