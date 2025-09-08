package com.event.core;

public class Faculty extends Person {
	
	private int Yoe;        	
	private String sme;
	public Faculty(String firstName, String lastName, int yoe, String sme) {
		super(firstName, lastName);
		Yoe = yoe;
		this.sme = sme;
	}
	
	public String getDetails() {
		return super.getDetails()+ " Faculty "+Yoe+" "+sme;
	}
	
}
