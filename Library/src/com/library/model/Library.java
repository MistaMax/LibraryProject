package com.library.model;

public class Library {
	private String name;
	private String location;
	
	public Library() {
		super();
	}
	public Library(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
