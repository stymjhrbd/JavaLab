package com.eshop.core;

public class Product {
	private int id;
	private String name;
	private String category;
	private int stock;
	private double price;

	public Product(int id, String name, String category, int stock, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.stock = stock;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product pro = (Product) obj;
			return (this.id == pro.id && this.category.equals(pro.category));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (73 * id) + category.hashCode();
	}

	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", category=" + category + ", stock=" + stock + ", price="
				+ price + "]";
	}

}
