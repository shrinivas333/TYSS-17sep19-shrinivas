package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {

	public static void main(String[] args) {
		

	PriorityQueue<Integer> pq=new PriorityQueue<>();
	
	pq.add(12);
	pq.add(24);
	pq.add(35);
	pq.add(35);
	pq.offer(1);
	
	System.out.println("before pool"+pq);
	System.out.println("using a iterator");
	
	Iterator i=pq.iterator();
	while(i.hasNext()==true) {
		System.out.println(pq.poll());
	}
	System.out.println("After poll"+pq);
	}
	
}
