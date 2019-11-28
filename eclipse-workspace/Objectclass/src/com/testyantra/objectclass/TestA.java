package com.testyantra.objectclass;

public class TestA {

	public static void main(String[] args) {
		
		Pendrive p=new Pendrive();
		USB.connect(p);
		
		Mouse m=new Mouse();
		USB.connect(m);	
	
	}
}
