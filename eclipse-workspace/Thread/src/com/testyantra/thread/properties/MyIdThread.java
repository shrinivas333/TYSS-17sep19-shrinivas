package com.testyantra.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main started");
	
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi=new MyIdThread();
		System.out.println("Myid Thread:"+mi.getId());

		System.out.println("priority:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(16);
		
		System.out.println("main ended");

	}

}
