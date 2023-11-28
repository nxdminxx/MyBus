package com.model;

public class User {
	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.isAuthenticated = false;
	}
	private String username;
	private String password;
	private String role;
	private Boolean isAuthenticated;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getIsAuthenticated() {
		return isAuthenticated;
	}
	public void setIsAuthenticated(Boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
}

