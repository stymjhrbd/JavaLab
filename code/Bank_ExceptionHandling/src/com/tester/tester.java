package com.tester;

import static com.Bank.validations.AccountNumberValidation.checkEqualAccountNumber;

import java.util.Scanner;

import com.Bank.core.BankAccount;
import com.Bank.core.CurrentAccount;
import com.Bank.core.SavingAccount;

public class tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;
		BankAccount[] bank = new BankAccount[100];
		int count = 0;

		do {
			System.out.println(
					"==========================\n1.Open savings account\n2.Open current account\n3.display account summary\n4.deposite\n5.withdraw\n=======================");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter details for new savings account accNo, bal, name, mobNum, interestRate");
				try {
					BankAccount ref = new SavingAccount(sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(),
							sc.nextDouble());
					checkEqualAccountNumber(bank, ref);
					bank[count] = ref;
					count++;
					System.out.println("SAVINGS ACCOUNT ADDED!!!!\n");
				} catch (Exception e) {
					System.out.println(e);
				}
				break;

			case 2:
				System.out.println("Enter details for new Current account accNo, bal, name, mobNum, interestRate");
				bank[count] = new CurrentAccount(sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), sc.nextDouble());
				count++;
				System.out.println("CURRENT ACCOUNT ADDED!!!!\n");

				break;

			case 3:
				System.out.println("Enter account number to get summary");
				int tempAcc = sc.nextInt();
				boolean flag = false;
				for (BankAccount b : bank) {
					if (b != null) {
						if (tempAcc == b.getAccNo()) {
							System.out.println(b);
							flag = true;
						}
					}
				}
				if (flag == false)
					System.out.println("Invalid account number");

				break;

			case 4:
				System.out.println("Enter account number to Deposit");
				int tempAccd = sc.nextInt();

				flag = false;
				for (BankAccount b : bank) {
					if (b != null) {
						if (tempAccd == b.getAccNo()) {
							System.out.println("enter amount");
							b.deposit(sc.nextDouble());
							flag = true;

						}
					}
				}
				if (flag == false)
					System.out.println("Invalid account number");

				break;

			case 5:
				System.out.println("Enter account number to Withdraw");
				int tempAccw = sc.nextInt();

				flag = false;
				for (BankAccount b : bank) {
					if (b != null) {
						if (tempAccw == b.getAccNo()) {
							try {
								System.out.println("enter amount");
								b.withdraw(sc.nextDouble());
								flag = true;
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}

						}
					}
				}
				if (flag == false)
					System.out.println("Invalid account number");

				break;

			default:
				System.out.println("Invalid choice");

			}
		} while (ch != 0);
		sc.close();

	}

}
