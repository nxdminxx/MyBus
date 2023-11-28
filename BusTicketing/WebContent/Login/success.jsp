<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME PAGE</title>
</head>
<body>

<h2>You are successfully login!</h2>

<%
	User user = (User)request.getAttribute("user");
	out.print("Welcome " + user.getUsername());
	%>


</body>
</html>