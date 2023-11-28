package com.model;

public class Booking {
    private User user;
    private String bookingId;
    // Add more properties as needed

    // Constructor
    public Booking(User user, String bookingId) {
        this.user = user;
        this.bookingId = bookingId;
        // Initialize other properties
    }

    // Getters and setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    // Add more getters and setters for additional properties
}

