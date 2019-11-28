package com.testyantra.thread.pausing;

public class Counter {

	int v=0;
	
	
	synchronized public void  increment() {
		v++;
		
	}
	
	synchronized public void decrement() {
		v--;
	}
	
	synchronized public void showVlaue() {
		System.out.println("v value is:"+v);
	}
}
