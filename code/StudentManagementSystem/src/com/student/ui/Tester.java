package com.student.ui;

import java.util.Scanner;

import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			StudentService service = new StudentServiceImpl();
			boolean flag = false;
			while (!flag) {
				System.out.println("0.Exit 1.Add Student 2.Display All Student 3.Cancel Admission 4.Search Student By email 5.Search by Course 6.Sort by email 7.Sort by course and dob ");
				System.out.println("enter choice ");
				try {
					switch (sc.nextInt()) {
					case 0:
						flag = true;
						break;
					case 1:
						System.out.println("Enter String name, String email, int marks, String course, String dob");
						System.out.println("Status "
								+ service.registerStudent(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next()));
						break;
					case 2:
						service.display();
						break;
					case 3:
						System.out.println("Enter email to cancel admission ");
						System.out.println("Status: "+ service.cancleAdmission(sc.next()));
						break;
					case 4:
						System.out.println("Enter email to search Student");
						System.out.println(service.searchStudent(sc.next()));
						break;
					case 5:
						System.out.println("Enter course to search student ");
						System.out.println("Status: "+ service.searchStudentByCourse(sc.next().toUpperCase()));
						break;
					case 6:
						service.sortByEmail();
						break;
					case 7:
						service.sortByCourseAndDob();
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
