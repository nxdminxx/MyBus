package com.model;

import java.util.ArrayList;
import java.util.List;
import com.model.User;
import com.model.Booking;
import com.model.Schedule;

public class MockData {
    // Generate mock user data
    public static List<User> generateMockUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("john", "password123"));
        userList.add(new User("mary", "securePass"));
        // Add more users as needed
        return userList;
    }

    // Generate mock booking data
    public static List<Booking> generateMockBookings(List<User> users) {
        List<Booking> bookingList = new ArrayList<>();
        for (User user : users) {
            bookingList.add(new Booking(user, "booking_" + user.getUsername()));
            // Add more booking details as needed
        }
        return bookingList;
    }

    // Generate mock schedule data
    public static List<Schedule> generateMockSchedules() {
        List<Schedule> scheduleList = new ArrayList<>();
        scheduleList.add(new Schedule(1, "Origin1", "Destination1", 20.0, "09:00 AM"));
        scheduleList.add(new Schedule(2, "Origin2", "Destination2", 25.0, "10:30 AM"));
        // Add more schedules as needed
        return scheduleList;
    }

    public static boolean isValidUser(String username, String password) {
        List<User> users = generateMockUsers();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true; // Credentials match a user in the mock data
            }
        }

        return false; // No user with matching credentials found
    }

   
    public static void main(String[] args) {
        // Example of generating and using mock data
        List<User> users = generateMockUsers();
        List<Booking> bookings = generateMockBookings(users);
        List<Schedule> schedules = generateMockSchedules();

        // Print or use the generated data as needed
        for (User user : users) {
            System.out.println("Username: " + user.getUsername() + ", Password: " + user.getPassword());
        }

        for (Booking booking : bookings) {
            System.out.println("Booking ID: " + booking.getBookingId() + ", User: " + booking.getUser().getUsername());
        }

        for (Schedule schedule : schedules) {
            System.out.println("Bus ID: " + schedule.getBusId() + ", Origin: " + schedule.getOrigin()
                    + ", Destination: " + schedule.getDestination() + ", Fare: " + schedule.getFare()
                    + ", Time: " + schedule.getTime());
        }
    }

	public static void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}
}
