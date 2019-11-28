package com.tetsyantra.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {
		
		LinkedList<Laptop> l=new LinkedList<>();
		Laptop l1=new Laptop(25000, 3, "Hp");
		Laptop l2=new Laptop(35000, 4, "Dell");
		Laptop l3=new Laptop(125000, 12, "Mac");
		Laptop l4=new Laptop(50000, 3, "Asus");
		
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(new Laptop(20000, 2, "acer"));
		
		System.out.println("Before sorting");
		dispalyDetails(l);
		
		Collections.sort(l);
		System.out.println("After sorting");
		dispalyDetails(l);
		
		
 }
	
	static void dispalyDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> i=l.iterator();
		
		while(i.hasNext()==true) {
			Laptop l1=i.next();
			System.out.println("Name of laptop: "+l1.name);
			System.out.println("price of laptop: "+l1.price);
			System.out.println("Ram of laptop: "+l1.ram);
			System.out.println("=============================");
		}
		
	}
}
