package com.ECommerce.tester;

import java.util.Scanner;

import com.ECommerce.service.EcommerceService;
import com.ECommerce.service.EcommerceServiceImpl;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			EcommerceService service = new EcommerceServiceImpl();

			boolean exit = false;

			while (!exit) {

				try {
					System.out.println(
							"------------------------\n1.Add Product\n2.Display All products\n3.Register Customer\n4.Customer Login\n5.Place Order\n6.View Customer Orders\n7.Cancel Order\n8.display customers\n9.Logout\n0.exit\n------------------------");

					System.out.println("Enter choice");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name type price stock");
						System.out.println(
								"Status: " + service.addProduct(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt()));

						break;
					case 2:
						service.displayAllProducts();

						break;
					case 3:
						System.out.println("Please Enter name email, password And role");
						System.out.println("Status: " + service.registerCustomer(sc.next(), sc.next(), sc.next(),sc.next()));

						break;
					case 4:
						System.out.println("Please Enter email and password to login");
						System.out.println("Status: " + service.loginCustomer(sc.next(), sc.next()));

						break;
					case 5:
						System.out.println("enter ProdId and quantity");
						System.out.println("Status: " + service.placeOrder(sc.nextInt(), sc.nextInt()));
						break;
					case 6:
						service.viewCustomerOrders();

						break;
					case 7:
						System.out.println("Enter OrderId and prodId to cancle order");
						System.out.println("Status: " + service.cancelOrder(sc.nextInt(), sc.nextInt()));

						break;

					case 8:
						service.displayCustomers();
						break;

					case 9:
						System.out.println(service.logoutCustomer());
						break;
					case 0:
						exit = true;
						System.out.println("Application terminated");
						break;

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}

			}

		}

	}

}
