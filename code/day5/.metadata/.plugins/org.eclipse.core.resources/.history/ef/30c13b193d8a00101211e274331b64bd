package com.bank.core;

public class BankAccount {
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
	
	public void deposit(double amount) {
		
		 bal+=amount;
		 System.out.println(amount+ " has deposited successfully and your balance is "+bal);
	}
	public void withdraw(double amount) {
		if(amount<=0) { System.out.println("invalid amount"); return;}
		if(bal>=amount) {
		 bal-=amount;
		 System.out.println(amount+ " has withdrawn successfully and your balance is "+bal);
		 }
		else System.out.println("insufficient balance");
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getDetails()
	{
		return "account details are "+accNo+" "+bal+" "+name+" "+mobNum;
	}
}
