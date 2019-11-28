package com.testyantra.predicate;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i>18;
		
		boolean res=p.test(12);
			if(res==true)
				System.out.println("eligible for vote");
			else
				System.out.println("not eligible");
	}
}
