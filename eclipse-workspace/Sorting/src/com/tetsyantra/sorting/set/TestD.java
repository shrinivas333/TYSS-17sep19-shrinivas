package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls=new LinkedHashSet<Double>();
		ls.add(12.3);
		ls.add(45.6);
		ls.add(1.5);
		ls.add(12.3);
		ls.add(95.5);
		
		System.out.println("**** using for each ****");
		for (Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("***using Iterator**********");
		Iterator<Double> i=ls.iterator();
		while(i.hasNext()==true) {
			System.out.println(i.next());
		}
		
	}
}
