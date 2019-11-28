package com.testyantra.function;

import java.util.function.Function;

public class TestA {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f=i->i*i;
		Integer square=f.apply(5);
		System.out.println("Square of Number is:"+square);
	}
}
