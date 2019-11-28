package com.testyantra.thread.properties;

public class MyPriority extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main started");
		
		int p=Thread.currentThread().getPriority();
		System.out.println("Main Thread Proirity:"+p);
		Thread.currentThread().setPriority(6);
		System.out.println("Main Thread Proirity changed:"+	Thread.currentThread().getPriority());
		
		MyPriority mp=new MyPriority();
		int q=mp.getPriority();
		System.out.println("MyPriority Thread:"+q);
		
		System.out.println("Main ended");
	}

}