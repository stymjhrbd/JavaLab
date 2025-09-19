package com.ECommerce.validations;

import com.ECommerce.exception.CustomerLoginException;

public class LoginValidation {
	
	public static void checkLogin(boolean login) throws CustomerLoginException {
		if(!login) throw new CustomerLoginException("Login to place order");
	}

}
