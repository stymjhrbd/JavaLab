package com.student.core;

public enum Course {
	COREJAVA(50,80), DBT(40,70), PYTHON(30,60) , MERN(20,85), WEBJAVA(30,75),DEVOPS(10,95);
	int seats,marks;
	private Course(int seats,int marks) {
		this.seats=seats;
		this.marks=marks;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString()
	{
		return name()+" has qualifying marks of "+marks;
	}
}
