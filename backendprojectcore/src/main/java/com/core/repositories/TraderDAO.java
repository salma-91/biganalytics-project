package com.core.repositories;

import java.util.List;

import com.core.models.Trader;

public interface TraderDAO {

	List<Trader> findAll();

	int findAllCount();

	List<Trader> findByLocation(String location);

	Trader findByUserId(int userId);

	Trader save(Trader trader);
}