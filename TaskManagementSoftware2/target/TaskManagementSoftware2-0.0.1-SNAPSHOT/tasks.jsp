<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="addForm2" method="POST" action="TasksControllerServlet">
	Task title: <br> <input required type="text" name="taskTitle"/> <br/>
	<br>
	Task description: <br> <input required type="text" name="taskDescription"/> <br/>
	<br>
    Project description:<br> <input required type="text" name="projectDescription"/> <br/>
    <br>
    Creator:<br> <input required type="text" name="creator"/> <br/>
    <br>
    Implementer:<br> <input required type="text" name="implementer"/> <br/>
    <br>
    Tester:<br> <input required type="text" name="tester"/> <br/>
    <br>
    Designer:<br> <input required type="text" name="designer"/> <br/>
    <br>
    <input type="submit" value="Add" />
</form>

</body>
</html>