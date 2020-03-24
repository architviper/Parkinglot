package com.parkinglot.model.ticket;

import java.util.Date;

public class ParkingTicket {

	private int tktnumber;
	private Date issuedAt;
	private Date exitAt;
	private int amount;
	private boolean status;
	public int getTktnumber() {
		return tktnumber;
	}
	public void setTktnumber(int tktnumber) {
		this.tktnumber = tktnumber;
	}
	public Date getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(Date issuedAt) {
		this.issuedAt = issuedAt;
	}
	public Date getExitAt() {
		return exitAt;
	}
	public void setExitAt(Date exitAt) {
		this.exitAt = exitAt;
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
	public ParkingTicket(int tktnumber, Date issuedAt, Date exitAt, int amount, boolean status) {
		super();
		this.tktnumber = tktnumber;
		this.issuedAt = issuedAt;
		this.exitAt = exitAt;
		this.amount = amount;
		this.status = status;
	}
	
	
	
}
