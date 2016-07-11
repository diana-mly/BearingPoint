
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="registerForm" method="POST" action="register">
	Name: <br> <input required type="text" name="name"/> <br/>
	<br>
	Surname: <br> <input required type="text" name="surname"/> <br/>
	<br>
    Email:<br> <input required type="text" name="email"/> <br/>
    <br>
    Password: <br> <input required type="password" name="password"/> <br/>
    <br>
    Admin Rights: <br> <input type="password" name="admin_rights" placeholder="Leave empty for standard user"/>
    <br/>
    <input type="submit" value="Register" />
</form>

</body>
</html>