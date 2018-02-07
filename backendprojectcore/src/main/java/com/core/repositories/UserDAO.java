package com.core.repositories;

import java.util.List;

import com.core.models.User;

public interface UserDAO {

	User save(User user);

	List<User> findByEmail(String email);

	List<User> findByEmailAndPassword(String email, String password);

	void update(User user);

}