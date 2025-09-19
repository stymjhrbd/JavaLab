package com.ECommerce.service;

import com.ECommerce.exception.CheckRoleException;
import com.ECommerce.exception.CustomerLoginException;
import com.ECommerce.exception.DuplicateEmailException;
import com.ECommerce.exception.DuplicateProductException;
import com.ECommerce.exception.InvalidCredentialsException;
import com.ECommerce.exception.OrderNotFoundException;
import com.ECommerce.exception.OutOfStockException;

public interface EcommerceService {
	String registerCustomer(String name, String email, String password,String role) throws DuplicateEmailException;

	String loginCustomer(String email, String password) throws InvalidCredentialsException;

	String logoutCustomer();

	String placeOrder(int productId, int quantity) throws OutOfStockException, CustomerLoginException;

	String cancelOrder(int orderId, int prodId) throws OrderNotFoundException, CustomerLoginException;

	String addProduct(String name, String type, double price, int stock)
			throws DuplicateProductException, OutOfStockException,CheckRoleException ;

	void viewCustomerOrders() throws CustomerLoginException;

	void displayAllProducts();

	void displayCustomers()throws CheckRoleException ;
}
