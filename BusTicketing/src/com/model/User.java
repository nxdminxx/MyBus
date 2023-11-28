package com.model;

public class User {
	private String username;
	private String role;
	private String password;
	private Boolean authenticated;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean isAuthenticated) {
		this.authenticated = isAuthenticated;
	}

	public User() {
		super();
		this.username = "";
		this.role = "guess";
		this.password = "";
		this.authenticated = false;
	}
	public User(String username, String role, String password) {
		super();
		this.username = username;
		this.role = role;
		this.password = password;
		this.authenticated = false;
	}
	public Boolean isUser() { return role.equals("user"); }

}
