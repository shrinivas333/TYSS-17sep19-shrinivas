package com.testyantra.collections.list;

import java.util.*;


public class TestH {
	public static void main(String[] args) {
		
		Vector ld=new Vector();
		ld.add(10);
		ld.add(15.5);
		ld.add(true);
		ld.add("hiii");
		ld.add('m');
		
		System.out.println("=====using for loop=====");
		for (int i = 0; i < ld.size(); i++) {
			System.out.println(i);
		}
		
		System.out.println("=====using for esch loop=====");
			for (Object o : ld) {
				System.out.println(o);
		}
			
		System.out.println("======using a iterator======");
			Iterator i=ld.iterator();
			while(i.hasNext() ==true) {
				System.out.println(i.next());
			}
			
		System.out.println("======using a  List iterator======");
			ListIterator il=ld.listIterator();
			while(il.hasNext() ==true) {
				System.out.println(il.next());
			}
		System.out.println("======using a list iterator backward======");
		
			while(il.hasPrevious() ==true) {
				System.out.println(il.previous());
			}
	}

}
