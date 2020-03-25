package com.parkinglot.model.dao;

import java.util.List;

import com.parkinglot.model.Parkinglot;

public class Driverdao {
	
	private static Driverdao driver =  new Driverdao();
	private List<Parkinglot> parkinglot; // ctrl + shift + O;
	
	public List<Parkinglot> getParkinglot() {
		return parkinglot;
	}

	public void setParkinglot(List<Parkinglot> parkinglot) {
		this.parkinglot = parkinglot;
	}

	private Driverdao(){
		
	}
	
	public static Driverdao getInstance(){
		return driver;
	}

	
	public static void main(String[] args){
		
		Driverdao driver = Driverdao.getInstance();
		driver.parkinglot.add(new Parkinglot("Altran", "Gurgaon"));
		driver.parkinglot.add(new Parkinglot("Wipro", "Gurgaon"));
		driver.parkinglot.add(new Parkinglot("Google", "Gurgaon"));
		
		for(int i =0 ; i < driver.parkinglot.size(); i++){
			driver.parkinglot.get(i).addFloor("A"+i, i, true);
		}
		
		
	}
}
