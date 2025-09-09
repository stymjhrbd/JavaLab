package com.Bank.core;


import com.exceptions.NegativeBalanceException;

public abstract class BankAccount {
	private int accNo;
	private double bal;
	private String name;
	private String mobNum;

	public BankAccount(int accNo, double bal, String name, String mobNum) {
		super();
		this.accNo = accNo;
		this.bal = bal;
		this.name = name;
		this.mobNum = mobNum;
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
		return "Account details are " + accNo + " " + bal + " " + name + " " + mobNum + "\n";
	}

	public void deposit(double amount) {

		bal += amount;
		System.out.println(amount + " has deposited successfully and your balance is " + bal);
	}

	public abstract void withdraw(double amount) throws NegativeBalanceException;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BankAccount) {
			int tempAcc = ((BankAccount) obj).getAccNo();
			if (this.accNo == tempAcc) {
				return true;
			}

		}
		return false;
	}

}
