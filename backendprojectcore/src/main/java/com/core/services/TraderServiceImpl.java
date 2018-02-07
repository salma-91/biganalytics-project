package com.core.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.exceptions.UserNotFoundException;
import com.core.models.Trader;
import com.core.models.User;
import com.core.repositories.TraderDAO;

@Service
public class TraderServiceImpl implements TraderService {
	
	private TraderDAO traderDAO;
	private UserService userService;
	
	@Autowired
	public TraderServiceImpl(TraderDAO traderDAO, UserService userService) {
	    this.traderDAO = traderDAO;
	    this.userService = userService;
	}
	
	@Override
	public List<Trader> findAll() {
		return traderDAO.findAll();
	}

	@Override
	public int findCount() {
		return traderDAO.findAllCount();
	}

	@Override
	public Trader findByUserEmailAddress(String email) {
		User user = null;
		try {
			user = userService.getByEmail(email);
		} catch (UserNotFoundException e) {
			return null;
		}
		return this.findByUserId(user.getId());
	}

	@Override
	public Trader findByUserId(int userId) {
		return traderDAO.findByUserId(userId);
	}
	
	@Override
	public void save(Trader trader) {
	}

	@Override
	public List<Trader> findByLocation(String location) {
		return null;
	}

	@Override
	public void addDoctor(User user) {
		if(user.getRole() == 1) {
			Trader trader = new Trader();
			trader.setUser(user);
			trader.setSpecialityCode("PHYSICIAN");
			traderDAO.save(trader);
		}
	}

}