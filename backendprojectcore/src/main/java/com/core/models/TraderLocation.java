package com.core.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TraderLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int traderId;
	private int IntermediateCenterId;
	private Timestamp createTime;
	private Timestamp lastUpdated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTraderId() {
		return traderId;
	}

	public void setTraderId(int traderId) {
		this.traderId = traderId;
	}

	public int getIntermediateCenterId() {
		return IntermediateCenterId;
	}

	public void setIntermediateCenterId(int intermediateCenterId) {
		IntermediateCenterId = intermediateCenterId;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
