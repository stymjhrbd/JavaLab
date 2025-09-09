package com.exceptions;

@SuppressWarnings("serial")
public class EqualAccountNumberException extends Exception{
	public EqualAccountNumberException(String ErrorMsg) {
		super(ErrorMsg);
	}
	

}
