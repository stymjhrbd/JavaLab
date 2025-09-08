package com.tester;

import java.util.Scanner;

import com.developers.Employee;

public class TestStatic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of employees ");
		
		Employee[] emp = new Employee[sc.nextInt()];
		
		for(int i=0;i<emp.length;i++) {
			
			System.out.println("enter details name salary deptid");
			
			emp[i] = new Employee(sc.next(), sc.nextInt(), sc.nextInt());
		}
//		int eSum=0;
//		for(Employee e:emp)
//		{
//			eSum+=e.getSalary();
//		}
//		System.out.println("Total emp sal is "+eSum);
		System.out.println("Enter dep id ");
		int tempId=sc.nextInt();
		System.out.println("Enter %hike ");
		double tempHike=sc.nextDouble();
		for(Employee e:emp)
		{
			if(e.getDeptId()==tempId)
			{
				double tempSal=e.getSalary();
				tempSal=tempSal+tempSal*tempHike;
				e.setSalary(tempSal);
				
			}
		}
		for(Employee e:emp)
		{
			System.out.println(e.getSalary());
		}
		
		double max =0;
		for(Employee e : emp) {
			if(e.getSalary()>max) max = e.getSalary();
		}
		for(Employee e : emp) {
			if(e.getSalary()==max) System.out.println(e.getName()+ " has max salary of "+max); 
		}
		System.out.println();
		sc.close();
	}

}
