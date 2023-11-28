package com.authentication;

import com.model.User;
import com.authentication.AuthenticationService;

public class AuthenticationService_Jdbc implements AuthenticationService {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User login(String username, String password) {
		// Connect to database
		// run sql query: 

		return null;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String currentPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	}
