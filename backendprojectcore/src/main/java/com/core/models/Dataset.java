//package com.core.models;
//
//import lombok.*;
//
//import static com.core.utils.Utils.INDEX;
//import static com.core.utils.Utils.TYPE;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;;
//@ToString
//@Document(indexName = INDEX, type = TYPE, shards = 5)
//public class Dataset {
//	@Id
//	private String id;
//	 
//    private long timestamp;
//	
//	private double open;
//	
//	private double high;
//	
//	private double low; 
//	
//	private double close;
//	
//	private double volumeBTC;
//	
//	private double volumeW;
//	
//	private double price;
//	
//	
//
//	public Dataset(long timestamp, double open, double high, double low, double close, double volumeBTC, double volumeW,
//			double price) {
//		super();
//		this.timestamp= timestamp;
//		this.open = open;
//		this.high = high;
//		this.low = low;
//		this.close = close;
//		this.volumeBTC = volumeBTC;
//		this.volumeW = volumeW;
//		this.price = price;
//	}
//
//	public long getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(long timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public double getOpen() {
//		return open;
//	}
//
//	public void setOpen(double open) {
//		this.open = open;
//	}
//
//	public double getHigh() {
//		return high;
//	}
//
//	public void setHigh(double high) {
//		this.high = high;
//	}
//
//	public double getLow() {
//		return low;
//	}
//
//	public void setLow(double low) {
//		this.low = low;
//	}
//
//	public double getClose() {
//		return close;
//	}
//
//	public void setClose(double close) {
//		this.close = close;
//	}
//
//	public double getVolumeBTC() {
//		return volumeBTC;
//	}
//
//	public void setVolumeBTC(double volumeBTC) {
//		this.volumeBTC = volumeBTC;
//	}
//
//	public double getVolumeW() {
//		return volumeW;
//	}
//
//	public void setVolumeW(double volumeW) {
//		this.volumeW = volumeW;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//  
//
//}