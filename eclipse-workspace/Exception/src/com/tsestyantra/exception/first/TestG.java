package com.tsestyantra.exception.first;

public class TestG {

	public static void main(String[] args) {
		System.out.println("main started");
		
		Paytam p=new Paytam();
		
		try {
			p.book();
		}
		catch(ArithmeticException ae) {
		
			System.out.println("Exception caughted in main method");
		}
		finally {
		
			System.out.println("Executing finally");
		}
		System.out.println("main ended");
	}
}
