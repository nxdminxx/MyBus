package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.app.ServiceLocator;
import com.controller.controller;
import com.authentication.AuthenticationService;
import com.services.session.SessionService;
import com.model.User;
import com.model.app.*;

@WebServlet("/login")
public class LoginServlet extends controller {

	private static final long serialVersionUID = 1L;
	private AuthenticationService auth;
	private SessionService session;

	@Override
	public void init() throws ServletException {
		super.init();
		auth = (AuthenticationService) ServiceLocator.getService("AUTHENTICATION_SERVICE");
		session = (SessionService) ServiceLocator.getService("SESSION_SERVICE");
	}

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// steps:
		// 1. Read inputs sent by the client
		// 2. perform credential checking
		// 3. If the user's credential match, establish a session for it
		// 4. Forward execution to view

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String page = "";

		User user = auth.login(username, password);
		if (user != null) {
			user.setAuthenticated(true);
			session.set("user", user);
			page = "home/home.jsp";
		} else {
			page = "Login/login_error.jsp";
		}

		response.sendRedirect("/"+ Configs.APP + "/"+page);
	}

}
