package com.student.service;

import static com.student.validations.StudentValidations.validateAllStudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.student.core.Course;
import com.student.core.Student;
import com.student.custom_exception.StudentCustomException;

public class StudentServiceImpl implements StudentService {
	ArrayList<Student> students = new ArrayList<>();

	public StudentServiceImpl() {
		students.add(new Student("jeet", "jeet@gmail.com", 80, "mern", "2000-10-30"));
		students.add(new Student("Meet", "meet@gmail.com", 90, "WEBJAVA", "2000-10-30"));
		students.add(new Student("geet", "geet@gmail.com", 95, "devops", "2000-10-30"));
		students.add(new Student("preet", "preet@gmail.com", 50, "COREJAVA", "2000-10-30"));
		students.add(new Student("reet", "reet@gmail.com", 65, "dbt", "2000-10-30"));
		students.add(new Student("satyam", "satyam@gmail.com", 79, "PYTHON", "2000-10-30"));
		students.add(new Student("smruti", "smruti@gmail.com", 69, "mern", "2000-05-30"));
	}

	@Override
	public String registerStudent(String name, String email, int marks, String course, String dob)
			throws StudentCustomException {
		Student ref = validateAllStudents(name, email, marks, course, dob, students);
		Course c = Course.valueOf(course.toUpperCase());
		if (c.getMarks() > marks && c.getSeats() != 0) {
			throw new StudentCustomException("Minumum " + c.getMarks() + " required ");
		}
		students.add(ref);
		c.setSeats(c.getSeats() - 1);
		return "Student Registered!!!, number of seats remaining :" + c.getSeats();
	}

	@Override
	public void display() {
		for (Student s : students) {
			System.out.println(s);
		}

	}

	@Override
	public String cancleAdmission(String email) throws StudentCustomException {
		Student s2 = new Student(email);
		int index = students.indexOf(s2);

		Student s1 = students.get(index);
		if (!students.remove(s2)) {
			throw new StudentCustomException("Invalid email ");
		}

		s1.getCourse().setSeats(s1.getCourse().getSeats() + 1);
		return "Admission Cancel for " + s1.getEmail() + "Updated Seats " + s1.getCourse().getSeats();
	}

	public static void findCourse() {

	}

	public String searchStudent(String email) throws StudentCustomException {
		Student s = new Student(email);
		if (students.contains(s)) {
			return "Email Found ";
		} else {
			throw new StudentCustomException("Invalid Email ");
		}
	}

	@Override
	public String searchStudentByCourse(String course) throws StudentCustomException {
		Course courses = Course.valueOf(course);
		for (Student s : students) {
			if (s.getCourse().equals(courses)) {
				return s.getName();
			}
		}
		throw new StudentCustomException("Course not found ");
	}

	@Override
	public void sortByEmail() {
		Collections.sort(students);

	}

	@Override
	public void sortByCourseAndDob() {
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int ret = s1.getCourse().compareTo(s2.getCourse());
				if (ret == 0) {
					return s1.getDob().compareTo(s2.getDob());
				}
				return ret;
			}

		});

	}

}
