package com.event.core;

public class Student extends Person {
	private int gYear;
	private String course;
	private int fees;
	private int marks;
	public Student(String firstName, String lastName, int gYear, String course, int fees, int marks) {
		super(firstName, lastName);
		this.gYear = gYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}
	public String getDetails()
	{
		return super.getDetails()+ " Rest "+ gYear+" "+course+" "+fees+" "+marks;
	}
	
}
