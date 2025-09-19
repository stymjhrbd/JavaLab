package com.ECommerce.core;

import java.util.ArrayList;

public class Order {
	private int orderId;
	private String email;
	private ArrayList<OrderItem> ListOfOrders;
	private static int orderIdCounter;
	static{
		orderIdCounter=100;
	}

	public Order(String email) {
		super();
		this.orderId = ++orderIdCounter;
		this.email = email;
		ListOfOrders = new ArrayList<>();
	}
	public Order(int orderId) {
		this.orderId = orderId;
	}

	public ArrayList<OrderItem> getListOfOrders() {
		return ListOfOrders;
	}

	public void setListOfOrders(OrderItem p) {
		ListOfOrders.add(p);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Order:		\n[orderId=" + orderId + ", email=" + email + ", ListOfOrders=" + ListOfOrders + "]";
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Order) {
			Order other = (Order) o;
			return orderId == other.orderId;
		}
		return false;
	}
	

	

}
