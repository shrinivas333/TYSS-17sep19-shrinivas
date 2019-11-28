package com.testyantra.accessmodifier.pkg1;

import com.testyantra.accessmodifier.pkg2.Demo;

public class sample extends Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		/*
		 * System.out.println(d.a); d.add();
		 */
	
	//default 
		/*
		 * System.out.println(d.b); d.sub();
		 */
	//protected
	sample s=new sample();
	System.out.println(s.c);
	s.mul();
	//public 
	System.out.println(d.name);
	d.div();
	}

}
