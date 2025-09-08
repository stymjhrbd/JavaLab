package com.tester;

import com.bank.core.*;

public class Tester {

	public static void main(String[] args) {
	BankAccount b1 = new SavingAccount(101, 2000, "Jeet", "6532563", 0.1);
		b1.deposit(500);
//		System.out.println();
//		System.out.println(b1.getDetails());
//		System.out.println();
//		b1.withdraw(2000);
//		System.out.println();
//		System.out.println(b1.getDetails());
//		System.out.println();
		if (b1 instanceof SavingAccount) {
			SavingAccount sr = (SavingAccount) b1;
			sr.applyInterest();
			System.out.println(sr.getDetails());
		}

//		
//		BankAccount b2 = new CurrentAccount(101, 10000, "Jeet", "32654563");
//		b2.deposit(500);
//		System.out.println();
//		System.out.println(b2.getDetails());
//
//		if (b2 instanceof CurrentAccount) {
//			CurrentAccount cr = (CurrentAccount) b2;
//			cr.useOverdraftFacility(11000);
//			System.out.println(cr.getDetails());
//			cr.useOverdraftFacility(2000);
//			System.out.println(cr.getDetails());
//		}

	}

}
