package com.event.core;

public class Person {
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getDetails() {
		
		return this.firstName +" " +this.lastName;
	}
	
	
}
