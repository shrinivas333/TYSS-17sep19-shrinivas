package com.testyantra.lambdaexpression;

public class TestFactorial {

	public static void main(String[] args) {

		FactorialInterface fact=(int n)->{
			int facto=1;
			for(int i=1;i<=n;i++) {
				facto=facto*i;
			}
			return facto;
		};
		int factorial=fact.factorial(5);
		System.out.println(factorial);
	}
}
