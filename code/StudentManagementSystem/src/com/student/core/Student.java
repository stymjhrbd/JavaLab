package com.student.core;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String email;
	private int marks;
	private Course course;
	private LocalDate dob;
	private static int idCounter;
	static {
		idCounter = 1000;
	}

	public Student(String name, String email, int marks, String course, String dob) {
		super();
		this.id = idCounter++;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = Course.valueOf(course.toUpperCase());
		this.dob = LocalDate.parse(dob);
	}

	public Student(String email) {
		super();
		this.email = email;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ ", dob=" + dob + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			return this.email.equals(other.email);
		}
		return false;
	}

	@Override
	public int compareTo(Student o) {
		return this.email.compareTo(o.email);
	}

}
