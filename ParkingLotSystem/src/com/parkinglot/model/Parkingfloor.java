package com.parkinglot.model;

import java.util.List;

public class Parkingfloor {

	private String pfname;
	private int level;
	private boolean status;
    private  List<Parkingslot> parkingslotls;	
	
	public List<Parkingslot> getParkingslotls() {
		return parkingslotls;
	}
	public void setParkingslotls(List<Parkingslot> parkingslotls) {
		this.parkingslotls = parkingslotls;
	}
	public String getPfname() {
		return pfname;
	}
	public void setPfname(String pfname) {
		this.pfname = pfname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Parkingfloor(String pfname, int level, boolean status) {
		super();
		this.pfname = pfname;
		this.level = level;
		this.status = status;
	}
	
	public  void addSpot(String name, boolean isfree, String status, String type){
		parkingslotls.add(new Parkingslot(name,isfree,status,type));
	}
	
}
