package com.ECommerce.core;

import java.util.ArrayList;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String password;
	private Role role;
	private ArrayList<Order> orderList;
	private static int idCounter;

	static {
		idCounter = 1000;
	}

	public Customer(String name, String email, String password,String role) {
		super();
		this.id = ++idCounter;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = Role.valueOf(role.toUpperCase());
		this.orderList = new ArrayList<>();

	}

	public Customer(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer:		\n[id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", orderList=" + orderList + "]";
	}

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(Order O) {
		this.orderList.add(O);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer other = (Customer) obj;
			return email.equals(other.email);
		}
		return false;
	}

}
