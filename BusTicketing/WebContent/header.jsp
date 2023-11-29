<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.app.Configs"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/header.css' />">
<meta charset="ISO-8859-1">
    <title>Bus Ticketing System</title>
</head>
<body>
    <header>
        <h1>Bus Ticketing System</h1>
       
        <nav>
		        <!-- User is logged in -->
		        <a href="<c:url value='/home/home_user.jsp' />">Home</a>
		        <a href="<c:url value='/dashboard.jsp' />">My Booking</a>
		        <a href="<c:url value='/logout' />">Logout</a>
        </nav>
    </header>
</body>
</html>