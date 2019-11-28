package com.testyantra.collections.list;

import java.util.*;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(45.5);
		al.add("yash");
		al.add(true);
		
		ListIterator i=al.listIterator();
		
		System.out.println("---------->forward");
		while(i.hasNext()==true) {
		System.out.println(i.next());	
		}
		System.out.println("Backward<-----------------");
		while(i.hasPrevious()==true) {
			System.out.println(i.previous());
		}
	}
}
