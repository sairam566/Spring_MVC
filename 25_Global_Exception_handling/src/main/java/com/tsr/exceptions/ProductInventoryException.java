package com.tsr.exceptions;

public class ProductInventoryException extends RuntimeException{

	public ProductInventoryException(String message) {
		super(message);
	}

	public ProductInventoryException(Throwable cause) {
		super(cause);
	}
	
	
}
