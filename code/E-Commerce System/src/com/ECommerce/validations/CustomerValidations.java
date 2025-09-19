package com.ECommerce.validations;

import java.util.ArrayList;

import com.ECommerce.core.Customer;
import com.ECommerce.core.Role;
import com.ECommerce.exception.CheckRoleException;
import com.ECommerce.exception.DuplicateEmailException;

public class CustomerValidations {
	
	public static Customer validateCustomerRegistration(String name, String email, String password,String role,ArrayList<Customer> customers)throws DuplicateEmailException {
		
		duplicateEmailValidation(customers, email);
		
		return new Customer(name,email,password,role);
	}

	public static void duplicateEmailValidation(ArrayList<Customer> customers, String email)
			throws DuplicateEmailException {
		Customer c1 = new Customer(email);

		if (customers.contains(c1)) {
			throw new DuplicateEmailException("Email already exist....!!");
		}

	}
	public static void checkRole(Role role) throws CheckRoleException {
		if(role != Role.ADMIN) throw new CheckRoleException("Login as a admin");
	}

}
