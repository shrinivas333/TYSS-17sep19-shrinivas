package com.testyantra.thread.properties;

public class MyThread  extends Thread{

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String tname=Thread.currentThread().getName();//It gives the Current Thread name
		System.out.println("Current thread="+tname);
		
		MyThread t1=new MyThread();
		String name=t1.getName();
		System.out.println("MyThread name is:"+name);
		
		Thread.currentThread().setName("Bala");
		t1.setName("Golu");
		
		System.out.println("My ThreadName:"+t1.getName());
		System.out.println(10/0);
		
		
		System.out.println("main ended");
	}
	
}
