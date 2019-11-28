package com.tsestyantra.exception.first;

public class TestC {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int a[]= {10,20,30};
		int b=10;
		
		try {
			System.out.println(b/0);
			System.out.println(a[1]);
			
		}
		catch(ArithmeticException ae) {
			System.out.println("number divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Index not present");
		}
		
		System.out.println("main ended");
	}
}
