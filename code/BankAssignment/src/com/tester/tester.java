package com.tester;

import java.util.Scanner;

import com.Bank.service.BankService;
import com.Bank.service.BankServiceImpl;

public class tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int ch = 0;
			BankService bank = new BankServiceImpl();

			do {
				System.out.println(
						"==========================\n1.Open savings account\n2.Open current account\n3.display account summary\n4.deposite\n5.withdraw\n=======================");
				System.out.println("Enter choice");
				ch = sc.nextInt();

				try {

					switch (ch) {
					case 1:
						System.out.println(
								"Enter details for new savings account accNo, bal, name, mobNum, interestRate");
						System.out.println("Status " + bank.openSavingAccount(sc.nextInt(), sc.nextDouble(), sc.next(),
								sc.next(), sc.nextDouble()));

						break;

					case 2:
						System.out.println(
								"Enter details for new savings account accNo, bal, name, mobNum, overDraftLimit");

						System.out.println("Status " + bank.openCurrentAccount(sc.nextInt(), sc.nextDouble(), sc.next(),
								sc.next(), sc.nextDouble()));
						break;

					case 3:
						bank.displayCustomerDetails();

						break;
					case 4:
						System.out.println("Enter account number, and amount to Deposit");
						bank.deposit(sc.nextInt(), sc.nextDouble());
						break;
					case 5:
						System.out.println("Enter account number, and amount to withdraw");
						bank.withdraw(sc.nextInt(), sc.nextDouble());
						break;
					default:
						System.out.println("Invalid choice");

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			} while (ch != 0);

		}
	}

}
