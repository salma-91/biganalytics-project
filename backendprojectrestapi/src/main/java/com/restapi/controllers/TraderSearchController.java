package com.restapi.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.helpers.TraderInfo;
import com.core.models.Trader;
import com.core.services.TraderService;

@RestController
public class TraderSearchController {

	final static Logger logger = LoggerFactory.getLogger(TraderSearchController.class);

	@Autowired
	TraderService traderService;

	@GetMapping(value = "/trader/count")
	public TraderInfo getTradersCount(ModelMap model) {
		int count = traderService.findCount();
		return new TraderInfo("All traders count", count);
	}

	@GetMapping(value = "/trader", produces = "application/json")
	public TraderInfo findAll(ModelMap model) {

		List<Trader> traders = traderService.findAll();
		if (traders == null) {
			return new TraderInfo();
		}
		return new TraderInfo();
	}
}