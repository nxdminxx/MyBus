package com.controller;


import com.model.Bus;
import com.model.MockData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class SearchBusServlet
 */
@WebServlet("/SearchBusServlet")
public class SearchBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public SearchBusServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user from the session (assuming user is already authenticated)
        // User user = (User) request.getSession().getAttribute("user");

        // Retrieve destination and origin from the form
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");

        // Retrieve bus list based on destination and origin
        List<Bus> busList = MockData.getBusList(origin, destination);

        // Set the bus list in the request scope
        request.setAttribute("busList", busList);

        // Forward to the bus list page
        request.getRequestDispatcher("/busList.jsp").forward(request, response);
    }
}
