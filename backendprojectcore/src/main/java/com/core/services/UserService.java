package com.core.services;

import com.core.exceptions.UnmatchingUserCredentialsException;
import com.core.exceptions.UserNotFoundException;
import com.core.models.User;

public interface UserService {
	
	User save(User user);
	
	void update(User user);
	
	User doesUserExist(String email) throws UserNotFoundException;
	
	User getByEmail(String email) throws UserNotFoundException;
	
	User isValidUser(String email, String password) throws UnmatchingUserCredentialsException;
}
