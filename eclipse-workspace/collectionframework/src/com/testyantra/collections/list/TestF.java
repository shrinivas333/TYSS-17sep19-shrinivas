package com.testyantra.collections.list;

import java.util.*;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("anupma");
		al.add("savita");
		al.add("kavita");
		al.add("Roopa");
		
		String name=al.get(0);
		System.out.println(name.toUpperCase());
		
		Iterator<String> i=al.iterator();
		while(i.hasNext()==true) {
			System.out.println(i.next().toUpperCase());
		}
		
		System.out.println("======using listiterator=====");
		
		ListIterator<String> il=al.listIterator();
		while(il.hasNext()==true) {
			System.out.println(il.next());
		}
		System.out.println("===using for each=====");
		
		for (String s : al) {
			System.out.println(s);
		}
	}
}
