package com.library.model;

import java.util.Date;

public class Audit {
	private int id;
	private int checkoutId;
	private Date startDate;
	private Date endDate;
	private int bookId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCheckoutId() {
		return checkoutId;
	}
	public void setCheckoutId(int checkoutId) {
		this.checkoutId = checkoutId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
}
