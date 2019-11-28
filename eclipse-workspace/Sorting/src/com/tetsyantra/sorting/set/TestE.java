package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts =new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
		ts.add(34);
//		ts.add("deepika") classcastException......
//		ts.add(null) NullpointerException....
		
		System.out.println("**** using for each ****");
		for (Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("***using Iterator**********");
		Iterator i=ts.iterator();
		while(i.hasNext()==true) {
			System.out.println(i.next());
		}
	}
}
