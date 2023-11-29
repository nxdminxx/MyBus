<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.app.Configs"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dashboard</title>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="user" class="com.model.User"
	scope="session"></jsp:useBean>
	
</head>
<body>

	<header>
        <%@ include file="/header.jsp" %>
    </header>
    
      <%@ include file="/busList.jsp" %>
    
    <footer>
        <%@ include file="/footer.jsp" %>
    </footer>

</body>
</html>