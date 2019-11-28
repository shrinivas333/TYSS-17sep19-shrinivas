package com.testyanra.customized.checkedException;

public class InvalidAmountException extends Exception{

	String message="Daily limit is 40000...";
	
	@Override
	public String getMessage() {
		
		return message;
	}
	
}
