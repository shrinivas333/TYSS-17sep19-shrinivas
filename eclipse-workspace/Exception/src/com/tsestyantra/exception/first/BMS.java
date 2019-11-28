package com.tsestyantra.exception.first;

public class BMS {

	public static void main(String[] args) {
		
		System.out.println("Bms started");
		
		PVR p=new PVR();
		
		try {
			p.book();
			System.out.println("booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("Booking Failed");
		}
		
		
		
		System.out.println("Bms ended");
	}
}
