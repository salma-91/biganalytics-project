package com.core.helpers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.core.models.Trader;


public class TraderInfo {
	
	private String message;
	private List<Trader> traders;
	private int count;
	
	public TraderInfo(){
	}
	
	@Autowired
	public TraderInfo(String message, int count) {
		this.setCount(count);
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Trader> getTraders() {
		return traders;
	}

	public void setTraders(List<Trader> traders) {
		this.traders = traders;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
