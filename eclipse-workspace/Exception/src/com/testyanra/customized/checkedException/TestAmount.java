package com.testyanra.customized.checkedException;

public class TestAmount {

	public static void main(String[] args) {
		
		System.out.println("main started");
	
		ValidateAmount va=new ValidateAmount();
		try {
			va.amountcheck(45000);
			System.out.println("widthdraw a cash");
		} catch (InvalidAmountException e) {
		
			System.err.println(e.getMessage());
		}
	
		System.out.println("Main ended");
	
	}
	
	
}
