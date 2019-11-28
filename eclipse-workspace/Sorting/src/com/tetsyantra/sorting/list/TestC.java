package com.tetsyantra.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		
		ll.add(12);
		ll.add(13);
		ll.add(23);
		ll.add(34);
		
		Integer peekElement=ll.peek();
		System.out.println("peek elements :"+peekElement);
		Integer peekFirstElement=ll.peekFirst();
		System.out.println("peek first elements :"+peekFirstElement);
		Integer peekLastElement=ll.peekLast();
		System.out.println("peek last elements :"+peekLastElement);
		
		System.out.println("After peek..........."+ll);
		
		System.out.println("==========================");
		Integer pollElement=ll.poll();
		System.out.println("poll elements :"+pollElement);
		Integer pollFirstElement=ll.pollFirst();
		System.out.println("poll first elements :"+pollFirstElement);
		Integer pollLastElement=ll.pollLast();
		System.out.println("poll last elements :"+pollLastElement);
		System.out.println("After poll......"+ll);
	
		System.out.println("++++++++++++++++++++++++++++++++");
		ll.push(12);
		System.out.println("After push.........."+ll);
		Integer p=ll.pop();
		System.out.println(p);
		System.out.println("After a pop():"+ll);
		
	}
}
