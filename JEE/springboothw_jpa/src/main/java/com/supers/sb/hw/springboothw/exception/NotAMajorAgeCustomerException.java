package com.supers.sb.hw.springboothw.exception;

public class NotAMajorAgeCustomerException extends Exception {

	public NotAMajorAgeCustomerException(String message) {
		super(message);
	}
	
	public NotAMajorAgeCustomerException(String message,Throwable th) {
		super(message,th);
	}
	
}
