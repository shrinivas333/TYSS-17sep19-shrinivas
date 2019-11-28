package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts =new TreeSet<>();
		
		ts.add("roopa");
		ts.add("Jaya");
		ts.add("shushma");
		ts.add("sheela");
		
		System.out.println("**** using for each ****");
		for (String o : ts) {
			System.out.println(o);
		}
		
		System.out.println("***using Iterator**********");
		Iterator<String> i=ts.iterator();
		while(i.hasNext()==true) {
			System.out.println(i.next());
		}
	}
}
