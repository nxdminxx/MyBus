<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.model.app.Configs"%>
    
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="user" class="com.model.User"
	scope="session"></jsp:useBean>
	
<body>
	<c:choose>
		<c:when test="${user.getAuthenticated()}">
			<c:redirect url="/${Configs.APP}/home/home.jsp" />
		</c:when>
		<c:otherwise>
		
    <h2>Bus Ticketing System</h2>
	<form name= loginForm action="/${Configs.APP}/login" method="post">
		<label>User Name: </label>
		<input type="text" name ="username"/>
		
		<label>Password: </label>
		<input type="text" name ="password"/>
		
		<input type = "submit" value ="login"/>
		</form>
		</c:otherwise>
	</c:choose>
</body>
</html>
