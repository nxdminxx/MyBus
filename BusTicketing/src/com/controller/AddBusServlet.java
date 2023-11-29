package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Bus;
import com.model.MockData;

/**
 * Servlet implementation class AddBusServlet
 */
@WebServlet("/AddBusServlet")
public class AddBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve data from the request
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");
        double fare = Double.parseDouble(request.getParameter("fare"));
        String departureTime = request.getParameter("departureTime");

        // Create a new bus object
        Bus newBus = new Bus(MockData.getNextBusId(), origin, destination, fare, departureTime);

        // Add the new bus to the model (database or mock data)
        MockData.addBus(newBus);

        // Redirect to the BusServlet to refresh the bus list
        response.sendRedirect("BusServlet");
    }
}