package com.testyantra.collections.list;

import java.util.*;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Comparable> al=new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("kavya");
		al.add(true);
		al.add(null);
		al.add('A');
	
		for (int i = 0; i < 6; i++) {
			Object obj=al.get(i);
			System.out.println(obj);
		}
	
	}
}
