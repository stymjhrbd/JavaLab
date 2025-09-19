package com.exceptions;

@SuppressWarnings("serial")
public class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String eMessage) {
		super(eMessage);
	}
}
