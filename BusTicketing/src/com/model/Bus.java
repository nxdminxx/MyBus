package com.model;

public class Bus {
	
	private String origin;
    private String destination;
    private double fare;
    private String departureTime;
	private int id;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	 public Bus(int id, String origin, String destination, double fare, String departureTime) {
	        this.id = id;
	        this.origin = origin;
	        this.destination = destination;
	        this.fare = fare;
	        this.departureTime = departureTime;
	    }
	
}
