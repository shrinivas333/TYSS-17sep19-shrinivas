package com.testyantra.lambdaexpression;

public class TestSquare {

	public static void main(String[] args) {
		
		SquareInterface squa=(int x)->x*x;
		int result=squa.square(5);
		System.out.println("Suare of number is:"+result);
	}
}
