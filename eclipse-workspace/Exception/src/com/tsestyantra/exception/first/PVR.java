package com.tsestyantra.exception.first;

public class PVR {

	void book() {
		
		System.out.println("booking Started");
		
		try {
			System.out.println(10/0);
			System.out.println("Bokking logic");
			System.out.println("booking confirmed");
		}catch(ArithmeticException ae) {
			
			System.out.println("Booking failed");
			throw ae;
		}
		
		
		System.out.println("PVR ended");
	}
}
