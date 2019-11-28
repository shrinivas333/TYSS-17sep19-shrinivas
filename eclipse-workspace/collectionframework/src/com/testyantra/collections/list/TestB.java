package com.testyantra.collections.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(22.5);
		al.add(true);
		al.add(null);
		al.add("Aunty...!");
		
		for (Object o : al) {
			System.out.println(o);
		}
	}
}
