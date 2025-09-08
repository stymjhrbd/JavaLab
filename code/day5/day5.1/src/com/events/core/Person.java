package com.events.core;

public class Person {
	//tight encapsulation
	private String firstName;
	private String lastName;
	public Person(String firstName,String lastName)
	{
		System.out.println("in person's ctor");
		this.firstName=firstName;
		this.lastName=lastName;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//override toString to return person's details
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName;
	}
	//getters for the complete name
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	

}
