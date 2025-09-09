package com.Bank.validations;

import com.Bank.core.BankAccount;
import com.exceptions.EqualAccountNumberException;

public class AccountNumberValidation {

	public static void checkEqualAccountNumber(BankAccount[] bank, BankAccount b1) throws EqualAccountNumberException {
		for (BankAccount b : bank) {
			if (b != null) {

				if (b.equals(b1)) {
					throw new EqualAccountNumberException(
							"Account number already exist, please enter differnt Account number");
				}

			}
		}

	}
}
