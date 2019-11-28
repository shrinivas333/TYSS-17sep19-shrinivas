package com.tsestyantra.exception.first;

public class TestB {

	public static void main(String[] args) {
		
		System.out.println("Mian started");
		
		int a=10;
		int b=0;
		
		try {
			b=a/0;
			System.out.println("hello");
			System.out.println("happy depavali");
		}catch(ArithmeticException se) {
			System.out.println("number is divide by Zero");
		}
		System.out.println(b);
		
		System.out.println("Main ended");
	}
}
