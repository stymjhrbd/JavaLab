package com.ECommerce.core;

public class Product {
	private int productId;
	private String name;
	private Category type;
	private double price;
	private int stock;
	private static int idCounter;

	static {
		idCounter = 100;
	}

	public Product(String name, String type, double price, int stock) {
		super();
		this.productId = ++idCounter;
		this.name = name;
		this.type = Category.valueOf(type.toUpperCase());
		this.price = price;
		this.stock = stock;
	}

	public Product(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product:			\n[productId=" + productId + ", name=" + name + ", type=" + type + ", price=" + price + ", stock="
				+ stock + "]";
	}

	public int getId() {
		return productId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getType() {
		return type;
	}

	public void setType(Category type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product p = ((Product) obj);
			return productId == p.productId;
		}

		return false;
	}

}
