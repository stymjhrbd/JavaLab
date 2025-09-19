package com.ECommerce.core;

public class OrderItem {
	private Product P;
	private int quantity;

	public OrderItem(Product p, int quantity) {

		P = p;
		this.quantity = quantity;
	}
	public OrderItem(Product p) {
		P = p;
	}

	public Product getProduct() {
		return P;
	}

	public void setProductId(Product p) {
		P = p;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItem:		\n[P=" + P + ", quantity=" + quantity + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof OrderItem) {
			OrderItem orderItem = (OrderItem)obj;
			return P.getId() == orderItem.P.getId();
		}
		return false;
	}

}
