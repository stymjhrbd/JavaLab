package com.Bank.validations;

import java.util.ArrayList;

import com.Bank.core.BankAccount;
import com.Bank.core.CurrentAccount;
import com.Bank.core.SavingAccount;
import com.exceptions.EqualAccountNumberException;
import com.exceptions.NegativeBalanceException;

public class BankValidations {

	public static final double MIN_BAL;

	static {
		MIN_BAL = 0;
	}

	public static BankAccount validateSavingAccount(int accNo, double bal, String name, String mobNum,
			double interestRate, ArrayList<BankAccount> Bank) throws EqualAccountNumberException {
		checkEqualAccountNumber(Bank, accNo);

		return new SavingAccount(accNo, bal, name, mobNum, interestRate);

	}

	public static BankAccount validateCurrentAccount(int accNo, double bal, String name, String mobNum,
			double overDraftLimit, ArrayList<BankAccount> Bank) throws EqualAccountNumberException {
		checkEqualAccountNumber(Bank, accNo);

		return new CurrentAccount(accNo, bal, name, mobNum, overDraftLimit);

	}

	public static void CheckBal(double bal) throws NegativeBalanceException {
		if (bal <= MIN_BAL)
			throw new NegativeBalanceException("Your balance is under limit.");

	}

	public static void checkEqualAccountNumber(ArrayList<BankAccount> Bank, int accNo)
			throws EqualAccountNumberException {
		BankAccount b1 = new BankAccount(accNo);
		if (Bank.contains(b1))
			throw new EqualAccountNumberException("Account number already exist, please enter differnt Account number");

	}

}
