<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage ="errorPage.jsp" import = "com.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getParameter("userName");
	String password = request.getParameter ("password");
	
	User user = (User)request.getAttribute("user");
	user.setUsername(username);
	user.setPassword(password);
	request.setAttribute("user", user);
	
	
	if (username == null || username.equals(""))
	{
		throw new Exception();
	}
	else
	{
		/* out.print("Welcome " + userName); */
		RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
		rd.forward(request,response);
	}
	 %>
</body>
</html>