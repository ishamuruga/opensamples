package com.supers.sb.hw.springboothw.exception;

public class CustomerFieldException extends Exception {

	public CustomerFieldException(String message) {
		super(message);
	}
	
	public CustomerFieldException(String message,Throwable th) {
		super(message,th);
	}
	
}
