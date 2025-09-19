package com.ECommerce.validations;

import java.util.ArrayList;

import com.ECommerce.core.Category;
import com.ECommerce.core.Product;
import com.ECommerce.exception.DuplicateProductException;
import com.ECommerce.exception.OutOfStockException;

public class ProductValidations {

	public static Product validateProduct(String name, String type, double price, int stock,
			ArrayList<Product> products) throws DuplicateProductException, OutOfStockException {
		duplicateProductValidation(name, type, products);
		insufficientProductInStock(stock);

		return new Product(name, type, price, stock);

	}

	public static void validateOrderPlacement(int productId, int quantity, ArrayList<Product> products)
			throws OutOfStockException {
		productOutOfStock(productId, quantity, products);

	}

	public static void duplicateProductValidation(String name, String type, ArrayList<Product> products)
			throws DuplicateProductException {
		for (Product p : products) {
			if (p.getName().equals(name) && p.getType() == Category.valueOf(type.toUpperCase())) {
				throw new DuplicateProductException("Product already exist");
			}
		}

	}

	public static void insufficientProductInStock(int stock) throws OutOfStockException {

		if (stock <= 0) {
			throw new OutOfStockException("Product is out of stock");
		}

	}

	public static void productOutOfStock(int productId, int quantity, ArrayList<Product> products)
			throws OutOfStockException {
		
		for(Product p: products) {
			if(p.getId() == productId) {
				int stock = p.getStock();
				if(quantity>stock)throw new OutOfStockException("Insufficient product quantity in stock");
				return;
			}
		}
		throw new OutOfStockException("Product not found in inventory");
	}

}
