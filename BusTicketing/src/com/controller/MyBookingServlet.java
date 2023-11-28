package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Booking;
import com.model.MockData;
import com.model.User;
import java.util.List;

@WebServlet("/myBooking")
public class MyBookingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve user from the session (assuming user is already authenticated)
        User user = (User) request.getSession().getAttribute("user");

        // Retrieve user's bookings from mock data
        List<Booking> userBookings = MockData.getUserBookings(user);

        // Set the user and booking data as request attributes
        request.setAttribute("user", user);
        request.setAttribute("userBookings", userBookings);

        // Forward to the MyBooking.jsp page
        request.getRequestDispatcher("/MyBooking.jsp").forward(request, response);
    }
}
