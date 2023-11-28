<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>
    <%@ page import="com.model.app.Configs"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="user" class="com.model.User"
	scope="session"></jsp:useBean>
<body>

	<c:choose>
		<c:when test="${user.getAuthenticated()}">
			<c:choose>
				<c:when test="${user.isUser()}">
					<c:redirect url="home_user.jsp" />
				</c:when>

				<c:otherwise>

					<c:redirect url="/${Configs.APP}/Login/login.jsp" />
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:otherwise>
			<c:redirect url="/${Configs.APP}/Login/login.jsp" />
		</c:otherwise>
	</c:choose>
	
	
</body>
</html>