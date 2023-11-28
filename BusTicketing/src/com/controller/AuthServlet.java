package com.controller;

import com.model.User;
import com.model.MockData; // Adjust the import statement

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve user credentials from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate credentials using mock data (assuming you've used MockData)
        boolean isValidUser = MockData.isValidUser(username, password);

        if (isValidUser) {
            // Set user information in the session
            User user = new User(username, password);
            request.getSession().setAttribute("user", user);

            // Redirect to the home page or another appropriate page
            response.sendRedirect(request.getContextPath() + "/");
        } else {
            // Redirect back to the login page with an error message
            request.setAttribute("errorMessage", "Invalid credentials");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
    }
}
