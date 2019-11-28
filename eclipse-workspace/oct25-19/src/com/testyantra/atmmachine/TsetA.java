package com.testyantra.atmmachine;

public class TsetA {

	public static void main(String[] args) {
		
		Machine m=new Machine();
		
		HDFC h1=new HDFC();
		m.slot(h1);
		System.out.println("======================");
		ICICI i=new ICICI();
		m.slot(i);
		System.out.println("======================");
		SBI s=new SBI();
		m.slot(s);
	}
}
