package com.student.custom_exception;

@SuppressWarnings("serial")
public class StudentCustomException extends Exception {
	public StudentCustomException(String message)
	{
		super(message);
	}
}
