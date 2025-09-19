package com.Bank.service;

import com.exceptions.EqualAccountNumberException;
import com.exceptions.NegativeBalanceException;

public interface BankService {

	String openSavingAccount(int accNo, double bal, String name, String mobNum, double interestRate)
			throws EqualAccountNumberException;

	String openCurrentAccount(int accNo, double bal, String name, String mobNum, double overDraftLimit)
			throws EqualAccountNumberException;

	void withdraw(int accNo, double amount) throws NegativeBalanceException;

	void deposit(int accNo, double amount) throws NegativeBalanceException;

	void displayCustomerDetails();

}
