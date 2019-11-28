package com.tetsyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Marker> al=new ArrayList<>();
		al.add(new Marker(60, "black"));
		al.add(new Marker(50, "blue"));
		al.add(new Marker(90, "green"));
		al.add(new Marker(80, "red"));
		
		System.out.println("Before sorting........");
		display(al);
		SortByPrice s=new SortByPrice();
		SortByColor sc=new SortByColor();
//		Collections.sort(al,s);
		Collections.sort(al,sc);
		
	
		System.out.println("After sorting........");
		display(al);
	}
	
	public static void display(ArrayList<Marker> al) {
		
		Iterator<Marker> i=al.iterator();
		while(i.hasNext()==true) {
			Marker m=i.next();
			System.out.println("color of marker is:"+m.color);
			System.out.println("price of marker is:"+m.price);
			System.out.println("================================");
		}
	}
}

