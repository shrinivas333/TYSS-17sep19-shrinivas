package com.tsestyantra.exception.first;

public class TestA {

	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int a[]= {10,20,30};
		System.out.println(a[1]);
		
		try {
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index not present");
		}
		
		System.out.println("Mian ended");
	}
}
