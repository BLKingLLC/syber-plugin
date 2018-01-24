package com.odysystems.service.impl;

public class GoogleUserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8820952067724250346L;

	
	public GoogleUserException() {
		
	}
	
	public GoogleUserException(String message) {
		super(message);
	}
	
	public GoogleUserException(Throwable cause) {
		super(cause);
	}
	
	public GoogleUserException(String message, Throwable cause) {
		super(message, cause);
	}
		
		public GoogleUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
		{ super(message, cause, enableSuppression, writableStackTrace);
	}
	
	
}
