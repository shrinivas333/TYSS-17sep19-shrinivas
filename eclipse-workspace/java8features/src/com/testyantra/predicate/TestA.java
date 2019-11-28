package com.testyantra.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i>1000;
		
	boolean res=p.test(999);
	System.out.println("Result:"+res);
	}
}
