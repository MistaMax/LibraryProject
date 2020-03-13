package com.library.model;

public class Customer {
	private int id;
	private String name;
	private String userName;
	private String passwordHash;
	
	public Customer() {
		super();
	}
	public Customer(int id, String name, String userName, String passwordHash) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.passwordHash = passwordHash;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	
}
