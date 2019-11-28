package com.testyantra.thread.defining;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main started");
		
		MyThread t=new MyThread();
		/*
		 * Dont call run() method,it behaves like normal program 
		 * t.run();
		 */
		
		t.start();
//		t.start(); IllegallThreadStateException
		
		for (int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
	}

}
