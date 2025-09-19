package com.ECommerce.service;

import static com.ECommerce.validations.CustomerValidations.checkRole;
import static com.ECommerce.validations.CustomerValidations.validateCustomerRegistration;
import static com.ECommerce.validations.LoginValidation.checkLogin;
import static com.ECommerce.validations.ProductValidations.validateOrderPlacement;
import static com.ECommerce.validations.ProductValidations.validateProduct;

import java.util.ArrayList;

import com.ECommerce.core.Customer;
import com.ECommerce.core.Order;
import com.ECommerce.core.OrderItem;
import com.ECommerce.core.Product;
import com.ECommerce.exception.CheckRoleException;
import com.ECommerce.exception.CustomerLoginException;
import com.ECommerce.exception.DuplicateEmailException;
import com.ECommerce.exception.DuplicateProductException;
import com.ECommerce.exception.InvalidCredentialsException;
import com.ECommerce.exception.OrderNotFoundException;
import com.ECommerce.exception.OutOfStockException;

public class EcommerceServiceImpl implements EcommerceService {
	ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<Product> products = new ArrayList<>();
	ArrayList<Order> orders;
	boolean login = false;
	Customer loginedCustomer;

	public EcommerceServiceImpl() {
		customers.add(new Customer("satyam", "satyam@gmail.com", "satyam@123","admin"));
		customers.add(new Customer("satyam1", "satyam1@gmail.com", "satyam1234","customer"));

		products.add(new Product("Earphone", "electronics", 2000, 10));
		products.add(new Product("cpp", "books", 1000, 20));
		products.add(new Product("salt", "grocery", 50, 50));
		products.add(new Product("Tshirt", "clothing", 800, 35));
	}

	@Override
	public String registerCustomer(String name, String email, String password,String role) throws DuplicateEmailException {

		Customer ref = validateCustomerRegistration(name, email, password,role, customers);

		customers.add(ref);

		return "Customer Registered!!!";
	}

	@Override
	public String loginCustomer(String email, String password) throws InvalidCredentialsException {
		Customer c1 = new Customer(email);

		int index = customers.indexOf(c1);
		if (index == -1)
			throw new InvalidCredentialsException("Invalid Email");

		if (!customers.get(index).getPassword().equals(password))
			throw new InvalidCredentialsException("Invalid Password");

		loginedCustomer = customers.get(index);
		orders = (loginedCustomer).getOrderList();

		login = true;
		return "You have login successfully";
	}

	@Override
	public String placeOrder(int productId, int quantity) throws OutOfStockException, CustomerLoginException {
		checkLogin(login);

		validateOrderPlacement(productId, quantity, products);

		Product prod = findProduct(productId, products);
		prod.setStock(prod.getStock() - quantity);

		Order order = new Order(loginedCustomer.getEmail());

		OrderItem orderItem = new OrderItem(prod, quantity);

		order.setListOfOrders(orderItem);
		loginedCustomer.setOrderList(order);

		return "Order Placed!!!";
	}

	@Override
	public String cancelOrder(int orderId, int prodId) throws OrderNotFoundException, CustomerLoginException {
		checkLogin(login);

		Customer customer = findCustomer(loginedCustomer.getEmail(), customers);
		ArrayList<Order> array = customer.getOrderList();

		Order order = findOrder(orderId, array);
		ArrayList<OrderItem> items = order.getListOfOrders();
		OrderItem orderItem = findOrderItem(prodId, items);
		int quantity = orderItem.getQuantity();
		Product prod = findProduct(prodId, products);
		prod.setStock(prod.getStock() + quantity);

		array.remove(order);

		return "Order Canceled";
	}

	@Override
	public String addProduct(String name, String type, double price, int stock)
			throws DuplicateProductException, OutOfStockException,CheckRoleException {
		checkRole(loginedCustomer.getRole());
		
		Product ref = validateProduct(name, type, price, stock, products);

		products.add(ref);

		return "Product Added Successfully!!!";
	}

	@Override
	public void viewCustomerOrders() throws CustomerLoginException {
		checkLogin(login);
		Customer ref = findCustomer(loginedCustomer.getEmail(), customers);
		for (Order o : ref.getOrderList()) {
			System.out.println(o);
		}
	}

	@Override
	public void displayAllProducts() {
		System.out.println(products);

	}

	@Override
	public void displayCustomers()throws CheckRoleException  {
		checkRole(loginedCustomer.getRole());

		for (Customer c : customers) {
			System.out.println(c);
		}
	}

	public String logoutCustomer() {
		login = false;
		loginedCustomer = null;

		return "Logout successful";
	}

	public static Customer findCustomer(String email, ArrayList<Customer> customers) {
		Customer c1 = new Customer(email);
		int index = customers.indexOf(c1);

		return customers.get(index);
	}

	public static Product findProduct(int productId, ArrayList<Product> products) {
		Product p = new Product(productId);
		int index = products.indexOf(p);
		return products.get(index);
	}

	public static Order findOrder(int orderId, ArrayList<Order> orders) throws OrderNotFoundException {
		Order order = new Order(orderId);
		int index = orders.indexOf(order);
		if (index == -1)
			throw new OrderNotFoundException("Order not found");
		return orders.get(index);
	}

	public static OrderItem findOrderItem(int prodId, ArrayList<OrderItem> orderItems) throws OrderNotFoundException {
		OrderItem orderItem = new OrderItem(new Product(prodId));
		int index = orderItems.indexOf(orderItem);
		if (index == -1)
			throw new OrderNotFoundException("OrderItem not found");
		return orderItems.get(index);
	}

}
