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


@WebServlet("/logout")
public class logoutServlet extends controller {
	private static final long serialVersionUID = 1L;
	private SessionService session;
	private AuthenticationService auth;

	@Override
	public void init() throws ServletException {
		super.init();
		auth = (AuthenticationService) ServiceLocator.getService("AUTHENTICATION_SERVICE");
		session = (SessionService) ServiceLocator.getService("SESSION_SERVICE");
	}


	public logoutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		auth.logout();
		session.delete("user");
		response.sendRedirect("Login/login.jsp");
	}

}
