package com.Bank.core;

import com.exceptions.NegativeBalanceException;

public class BankAccount {
	private int accNo;
	private double bal;
	private String name;
	private String mobNum;
	private AccountType ac;


	public BankAccount(int accNo, double bal, String name, String mobNum, AccountType ac) {
		super();
		this.accNo = accNo;
		this.bal = bal;
		this.name = name;
		this.mobNum = mobNum;
		this.ac = ac;
	}

	public BankAccount(int accNo) {
		this.accNo = accNo;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getAccNo() {
		return accNo;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", bal=" + bal + ", name=" + name + ", mobNum=" + mobNum + ", Account Type=" + ac
				+ "]";
	}

	public void deposit(double amount) {

		bal += amount;
		System.out.println(amount + " has deposited successfully and your balance is " + bal);
	}

	public void withdraw(double amount) throws NegativeBalanceException {

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BankAccount) {
			BankAccount tempAcc = ((BankAccount) obj);
			if (this.accNo == tempAcc.accNo) {
				return true;
			}

		}
		return false;
	}

}
