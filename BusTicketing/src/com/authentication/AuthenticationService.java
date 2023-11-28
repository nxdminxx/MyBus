package com.authentication;

import com.model.User;
import com.model.app.Service;

public interface AuthenticationService extends Service {
	public User login(String username, String password);

	public void logout();

	public void changePassword(String currentPassword, String newPassword);

}
