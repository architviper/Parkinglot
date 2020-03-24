package com.parkinglot.model.payment;

import java.sql.Date;

public class Payment {
	
	private Date createdDate;
	private int amount;
	private boolean status;
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Payment(Date createdDate, int amount, boolean status) {
		super();
		this.createdDate = createdDate;
		this.amount = amount;
		this.status = status;
	}
	
	
	

}
