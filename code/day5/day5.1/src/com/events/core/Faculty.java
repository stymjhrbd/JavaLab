package com.events.core;

public class Faculty extends Person {
	private int experienceInYears;
	private String sme;

	public Faculty(String fn, String ln, int years, String sme) {
		super(fn, ln);
		System.out.println("in faculty ctor");
		this.experienceInYears = years;
		this.sme = sme;
	}

	/*
	 * Add overriding form of toString the method to return COMPLETE details of a
	 * faculty
	 */
	@Override
	public String toString() {
		return "Faculty " + super.toString() + " exp in years " + experienceInYears + " expert in " + sme;
	}

	/*
	 * 5. Student Evaluation By Faculty i/p : student name , student grade (A+ , A ,
	 * B+ , B , C+ , C)
	 * 
	 */
	
	public void evaluateStudent(String studentName, String grade) {
		System.out.println("Faculty " + getFirstName() 
		+ " " + getLastName() + " evaluating " + studentName
				+ " given the grade " + grade);
	}

}
