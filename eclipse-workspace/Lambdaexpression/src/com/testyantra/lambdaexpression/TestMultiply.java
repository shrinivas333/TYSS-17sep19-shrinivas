package com.testyantra.lambdaexpression;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface multi=(a,b)->a*b;
		int sum=multi.multiply(5,8);
		System.out.println(sum);
	}
}
