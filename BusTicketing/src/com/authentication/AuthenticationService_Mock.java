package com.authentication;

import com.model.User;
import com.authentication.AuthenticationService;

public class AuthenticationService_Mock implements AuthenticationService {

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	public AuthenticationService_Mock() {
	}

	@Override
	public User login(String username, String password) {
		if (username.equals("user1") && password.equals("pwd"))
			return new User(username, "user", password);

		if (username.equals("user2") && password.equals("pwd"))
			return new User(username, "user", password);

		return null;
	}

	@Override
	public void changePassword(String currentPassword, String newPassword) {
	}

	@Override
	public void logout() {
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
