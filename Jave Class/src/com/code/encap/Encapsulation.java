package com.code.encap;

public class Encapsulation {
	
	private String firstName;
	
	private String lastName;
	
	public Encapsulation() {
		
	}
	
	public Encapsulation(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
