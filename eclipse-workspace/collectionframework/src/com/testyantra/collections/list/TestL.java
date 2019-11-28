package com.testyantra.collections.list;

import java.util.*;

public class TestL {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add(12);
		ll.add(13);
		ll.add(34);
		ll.add(3);
		ll.add(10);
		
		System.out.println("Before sorting :"+ll);
		Collections.sort(ll);
		System.out.println("After sorting :"+ll);
		
		Collections.reverse(ll);
		System.out.println("After reversing a list"+ll);
		

		Collections.shuffle(ll);
		System.out.println("After a shuffling"+ll);
	}
}
