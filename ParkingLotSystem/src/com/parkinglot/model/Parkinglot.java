package com.parkinglot.model;

import java.util.List;

public class Parkinglot {
	
	private String plname;
	
	private String loaction;
	
	private List<Parkingfloor> parkingfloor;
	

	public List<Parkingfloor> getParkingfloor() {
		return parkingfloor;
	}

	public void setParkingfloor(List<Parkingfloor> parkingfloor) {
		this.parkingfloor = parkingfloor;
	}

	public String getPlname() {
		return plname;
	}

	public void setPlname(String plname) {
		this.plname = plname;
	}

	public String getLoaction() {
		return loaction;
	}

	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}

	public Parkinglot(String plname, String loaction) {
		super();
		this.plname = plname;
		this.loaction = loaction;
	}
	
	
	public void addFloor(String pfname, int level, boolean status){
		parkingfloor.add(new Parkingfloor(pfname,level, status));
		
	}
	

}
