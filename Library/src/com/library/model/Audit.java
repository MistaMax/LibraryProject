package com.library.model;

import java.util.Date;

public class Audit {
	private int id;
	private int customerId;
	private Date checkoutDate;
	private Date returnDate;
	private int bookId;
	
	public Audit() {
		super();
	}
	
	public Audit(int id, int customerId, Date checkoutDate, Date returnDate, int bookId) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.checkoutDate = checkoutDate;
		this.returnDate = returnDate;
		this.bookId = bookId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
}
