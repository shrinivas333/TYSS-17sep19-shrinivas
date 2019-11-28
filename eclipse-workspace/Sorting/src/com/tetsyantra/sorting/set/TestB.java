package com.tetsyantra.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("sujay");
		hs.add("drijay");
		hs.add("enjoy");
		
		System.out.println("**** using for each ****");
		for (Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("***using Iterator**********");
		Iterator<String> i=hs.iterator();
		while(i.hasNext()==true) {
			System.out.println(i.next());
		}
		
	}
}
