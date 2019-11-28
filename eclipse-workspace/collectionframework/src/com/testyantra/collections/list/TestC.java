package com.testyantra.collections.list;

import java.util.*;


public class TestC {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(52.3);
		al.add(true);
		al.add("Good evening");
		
		
		Iterator it=al.iterator();

		while(it.hasNext()==true) {
			System.out.println(it.next());
		}
		
		
		
		for(int i=0;i<al.size();i++) {
			Object o=al.get(i);
			System.out.println(o);
		}
		
		ArrayList al1=new ArrayList();
		
		al1.add(10);
		al1.add(true);
		al1.add("munnu");
		al1.add('A');
		
		Iterator itt=al1.iterator();
		
		Object o=itt.next();
		System.out.println(o);
		
		Object o1=itt.next();
		System.out.println(o1);
		Object o2=itt.next();
		System.out.println(o2);
		Object o3=itt.next();
		System.out.println(o3);
//		Object o4=itt.next();
//		System.out.println(o4);
//		NoSuchElementExceptiion
	}
}
