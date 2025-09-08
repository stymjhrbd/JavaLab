package com.developers;
import static java.lang.System.out;

public class Employee {
	private int id; //auto generated 
	private String name;
	private double salary;
	private int deptId;

	
	private static int idGenerator;


	static {
		idGenerator=1000;
	}
	public Employee(String name, double salary, int deptId) {	
		this.id=idGenerator++;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeptId() {
		return deptId;
	}
	
	
}
