package com.model;

public class Schedule {
    private int busId;
    private String origin;
    private String destination;
    private double fare;
    private String time;

    // Constructor
    public Schedule(int busId, String origin, String destination, double fare, String time) {
        this.busId = busId;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
        this.time = time;
    }

    // Getters and setters

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
