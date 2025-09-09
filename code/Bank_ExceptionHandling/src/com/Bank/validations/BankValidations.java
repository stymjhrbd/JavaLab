package com.Bank.validations;

import com.exceptions.NegativeBalanceException;

public class BankValidations {
	
	public static final double MIN_BAL;
	
	static {
		MIN_BAL = 0;
	}
	
	public static void CheckBal(double bal) throws NegativeBalanceException {
		if(bal<=MIN_BAL) throw new NegativeBalanceException("Your balance is under limit.");
		
	}

}
