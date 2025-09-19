package com.student.validations;

import java.util.List;

import com.student.core.Student;
import com.student.custom_exception.StudentCustomException;

public class StudentValidations {
	public static Student validateAllStudents(String name, String email, int marks, String course, String dob,
			List<Student> students) throws StudentCustomException {
		checkForDuplicateEmail(email, students);
		return new Student(name, email, marks, course, dob);
	}

	public static void checkForDuplicateEmail(String email, List<Student> students) throws StudentCustomException {
		Student s = new Student(email);
		if (students.contains(s)) {
			throw new StudentCustomException("Duplicate email id found ");
		}
	}
}
