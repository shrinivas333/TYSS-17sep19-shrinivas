package com.testyantra.accessmodifier.pkg2;

public class Demo {

	private int a=10;
	long b=700;
	protected double c=76.89;
	public String name="Anu";
	
	private void add() {
		System.out.println("demo add()");
	}
	void sub() {
			System.out.println("demo sub()");
	}
	protected void mul() {
		System.out.println("demo mul()");
	}
	public void div() {
		System.out.println("demo div()");
	}
}
