package com.event.tester;

import java.util.Scanner;

import com.event.core.*;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter max number of peoples");
		Person[] peoples = new Person[sc.nextInt()];
		boolean flag=false;
		int counter=0;
		while(!flag)
		{
			System.out.println("==========================\n1.Add Student\n 2.Add Faculty\n 3.Show Details\n 0.Exit\n===========================\n");
			System.out.println("Enter your choice");
			switch(sc.nextInt())
			{
			case 1:
				if(counter < peoples.length)
				{
					System.out.println("Enter details fname,lname,year,course,fees,marks ");
					peoples[counter]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
					counter++;
				}
				else
				{
					System.out.println("Sorry !!! you cant participate as event is full try next time ");
				}
				break;
				
			case 2:
				if(counter < peoples.length)
				{
					System.out.println("Enter details fname,lname,yoe,sme ");
					peoples[counter]=new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
					counter++;
				}
				else
				{
					System.out.println("Sorry !!! you cant participate as event is full try next time ");
				}
				break;
			case 3:
				for(Person p: peoples) {
					if(p!=null) {
					System.out.println(p.getDetails());
					}
				}
				break;
			case 0:
				flag= true;
				break;
				
			default:
				System.out.println("invalid choice");
				break;
			}
		}
		
		sc.close();
	}

}
