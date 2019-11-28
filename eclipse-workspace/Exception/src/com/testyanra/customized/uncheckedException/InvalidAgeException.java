package com.testyanra.customized.uncheckedException;

public class InvalidAgeException extends RuntimeException {

	private String message="Inavlid age";
	
	public InvalidAgeException() {
	
	}
	
	
	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

	

	@Override
	public String toString() {
		return message;
	}

//
//	@Override
//	public String getMessage() {
//		
//		return message;
//	}
}
