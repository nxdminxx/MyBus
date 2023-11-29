package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Bus;
import com.model.MockData;

/**
 * Servlet implementation class BusServlet
 */
@WebServlet("/BusServlet")
public class BusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Retrieve bus list from the model (database or mock data)
	        List<Bus> busList = MockData.getBusList(null, null);

	        // Set bus list in the request attribute
	        request.setAttribute("busList", busList);

	        // Forward the request to busList.jsp
	        RequestDispatcher dispatcher = request.getRequestDispatcher("busList.jsp");
	        dispatcher.forward(request, response);
	    }
	}