package com.bank.core;

public class CurrentAccount extends BankAccount {
	private double overDraftLimit=2000;

	public CurrentAccount(int accNo, double bal, String name, String mobNum) {
		super(accNo, bal, name, mobNum);

	}
	
	
	public String getDetails()
	{
		return super.getDetails()+ " remaining overDraftLimit "+overDraftLimit;
	}
	
	public void useOverdraftFacility(double amount) {
		double tempBal;
		tempBal = super.getBal();
		if(Math.abs(amount-tempBal)<=overDraftLimit) {
			overDraftLimit -=Math.abs(amount-tempBal);
			tempBal -= amount;
			super.setBal(tempBal);
			
			
		}
		else System.out.println("OverDraft limit reached");
	}
	
}
