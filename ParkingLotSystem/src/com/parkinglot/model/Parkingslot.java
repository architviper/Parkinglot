package com.parkinglot.model;

public class Parkingslot {

	private String name;
	private boolean isfree;
	
	
	private String status;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isIsfree() {
		return isfree;
	}
	public void setIsfree(boolean isfree) {
		this.isfree = isfree;
	}
	
	public Parkingslot(String name, boolean isfree, String status, String type) {
		super();
		this.name = name;
		this.isfree = isfree;
		this.status = status;
		this.type = type;
	}
}
