package com.student.service;

import java.rmi.StubNotFoundException;

import com.student.custom_exception.StudentCustomException;

public interface StudentService {

	String registerStudent(String name, String email, int marks, String course, String dob)
			throws StudentCustomException;

	void display();

	String cancleAdmission(String email) throws StudentCustomException;
	String searchStudent(String email) throws StudentCustomException;
	String searchStudentByCourse(String email) throws StudentCustomException;

	void sortByEmail();

	void sortByCourseAndDob();
}
