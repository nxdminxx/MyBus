<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Bus Ticketing System</h2>
	<form name= loginForm method = post action="home.jsp">
		<label>User Name: </label>
		<input type="text" name ="username"/>
		
		<label>Password: </label>
		<input type="text" name ="password"/>
		
		<input type = "submit" value ="login"/>
    </form>

</body>
</html>
