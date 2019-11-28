package com.testyantra.thread.pausing;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		Counter c=new Counter();
		Runnable r1=()->{
			c.increment();
			c.showVlaue();
		};
		
		Runnable r2=()->{
			c.decrement();
			c.showVlaue();
	
		};
		
		Thread t=new Thread(r1);
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
		System.out.println("main ended");
	}
}
