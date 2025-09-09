package com.Bank.core;

import static com.Bank.validations.BankValidations.CheckBal;

import com.exceptions.NegativeBalanceException;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount(int accNo, double bal, String name, String mobNum, double interestRate) {
		super(accNo, bal, name, mobNum);
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double tempBal = super.getBal();
		tempBal = tempBal + tempBal * (interestRate / 10);
		super.setBal(tempBal);
	}

	@Override
	public void withdraw(double amount) throws NegativeBalanceException {
		double minimumBal = 5000;
		double savBal = super.getBal();
		CheckBal(savBal);
		if (savBal - minimumBal >= amount) {
			System.out.println("Amount has been withdrawn " + amount);

		} else {
			System.out.println("Insufficient balance");

		}

	}

	@Override
	public String toString() {
		return super.toString() + " Interest Rate " + interestRate;
	}

}
