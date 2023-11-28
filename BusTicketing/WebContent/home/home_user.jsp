<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.app.Configs"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="user" class="com.model.User"
	scope="session"></jsp:useBean>

</head>
<body>
	<c:choose>
		<c:when
			test="${user.getAuthenticated()&&user.isUser()}">
			<h1>User Home Page</h1>
			<h2>
				Welcome
				<jsp:getProperty property="username" name="user" />
			</h2>
			<a href="/${Configs.APP}/logout">Logout</a>
		</c:when>
		<c:otherwise>
			<c:redirect url="/${Configs.APP}/:ogin/login.jsp" />
		</c:otherwise>
	</c:choose>
</body>
</html>