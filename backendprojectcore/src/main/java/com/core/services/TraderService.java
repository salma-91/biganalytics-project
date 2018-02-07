package com.core.services;

import java.util.Iterator;
import java.util.List;

import com.core.models.Trader;
import com.core.models.User;

public interface TraderService {

	void save(Trader trader);

	List<Trader> findByLocation(String location);

	List<Trader> findAll();

	Trader findByUserEmailAddress(String email);

	int findCount();

	Trader findByUserId(int userId);

	void addDoctor(User user);
}
