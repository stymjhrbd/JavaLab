package com.Bank.service;

import static com.Bank.validations.BankValidations.CheckBal;
import static com.Bank.validations.BankValidations.validateCurrentAccount;
import static com.Bank.validations.BankValidations.validateSavingAccount;

import java.util.ArrayList;

import com.Bank.core.BankAccount;
import com.exceptions.EqualAccountNumberException;
import com.exceptions.NegativeBalanceException;

public class BankServiceImpl implements BankService {
	private ArrayList<BankAccount> Bank = new ArrayList<>();

	public BankServiceImpl() {
	}

	@Override
	public String openSavingAccount(int accNo, double bal, String name, String mobNum, double interestRate)
			throws EqualAccountNumberException {

		BankAccount ref = validateSavingAccount(accNo, bal, name, mobNum, interestRate, Bank);

		Bank.add(ref);
		return "Your Saving account is created!!!";
	}

	@Override
	public String openCurrentAccount(int accNo, double bal, String name, String mobNum, double overDraftLimit)
			throws EqualAccountNumberException {

		BankAccount ref = validateCurrentAccount(accNo, bal, name, mobNum, overDraftLimit, Bank);

		Bank.add(ref);
		return "Your Current account is created!!!";
	}

	@Override
	public void withdraw(int accNo, double amount) throws NegativeBalanceException {
		BankAccount b1 = new BankAccount(accNo);
		for (BankAccount b : Bank) {
			if (b != null) {
				if (b.equals(b1)) {
					CheckBal(b.getBal());
					b.withdraw(amount);
				}

			}
		}

	}

	public void deposit(int accNo, double amount) throws NegativeBalanceException {
		BankAccount b1 = new BankAccount(accNo);
		for (BankAccount b : Bank) {
			if (b != null) {
				if (b.equals(b1)) {
					CheckBal(b.getBal());
					b.deposit(amount);
				}

			}
		}
	}

	@Override
	public void displayCustomerDetails() {

		for (BankAccount b : Bank) {
			if (b != null) {
				System.out.println(b);
			}
		}

	}

}
