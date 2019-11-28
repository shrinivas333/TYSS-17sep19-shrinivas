package com.testyantra.exception.second;

public class TestA {
	public static void main(String[] args) {
	
		System.out.println("Main started");
		try {
			
			Thread.sleep(3000);
			System.out.println("Inside a Try");
			
		} catch (InterruptedException e) {

			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		
		System.out.println("Main ended");
		
	}
}
