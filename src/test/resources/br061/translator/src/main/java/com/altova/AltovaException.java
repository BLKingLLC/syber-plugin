/**
 * AltovaException.java
 *
 * This file was generated by MapForce 2015sp2.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package com.altova;


public class AltovaException extends RuntimeException {
	protected Exception	innerException;
	protected String	message;

	public AltovaException(String text) {
		innerException = null;
		message = text;
	}

	public AltovaException(Exception other) {
		innerException = other;
		message = other.getMessage();
	}

	public String getMessage() {
		return message;
	}

	public Exception getInnerException() {
		return innerException;
	}
}
