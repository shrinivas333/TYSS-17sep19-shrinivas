package com.testyantra.typecasting.primitive;

public class TestA {

	public static void main(String[] args) {
		byte a=10;
		int b=a; //Implicit Casting.
		System.out.println("b is :"+b);
		
		int p=20;
		double q=p;
		System.out.println("q is :"+q);
		
		System.out.println("====+======+======");
		double x=69.53;
		int y=(int)x;//Explicit casting
		System.out.println("y is :"+y);
		
		byte z= (byte) x;
		System.out.println("Z is :"+z);
		
		char r= (char)x;
		System.out.println("r is :"+r);
	}
}
