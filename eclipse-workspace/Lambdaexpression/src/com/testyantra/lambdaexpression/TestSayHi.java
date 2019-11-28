package com.testyantra.lambdaexpression;

public class TestSayHi {

	public static void main(String[] args) {
		
		SayHiInterface hi=()->System.out.println("hi");
		
		hi.sayHi();
	}
}
