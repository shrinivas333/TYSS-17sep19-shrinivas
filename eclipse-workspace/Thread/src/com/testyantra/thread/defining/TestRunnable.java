package com.testyantra.thread.defining;

public class TestRunnable {

	public static void main(String[] args) {

		System.out.println("main strted");
		MyRunnable mr=new MyRunnable();
//		mr.start(); start method undefined in runnable interface
		//constructor overloading
		Thread t=new Thread(mr);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
		
	}

}
