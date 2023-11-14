package com.tsr.exceptions;

public class InvalidProductException extends RuntimeException{

	public InvalidProductException(String message) {
		super(message);
	}

	public InvalidProductException(Throwable cause) {
		super(cause);
	}
	
}
