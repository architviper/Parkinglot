package com.parkinglot.model.vehicle;

public class Vehicle {

	private String type ;
	private String regNo;
    private String color;
    private String model;
    
    
	public Vehicle(String type, String regNo, String color, String model) {
		super();
		this.type = type;
		this.regNo = regNo;
		this.color = color;
		this.model = model;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
    
	
}
