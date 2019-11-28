package com.testyantra.objectclass;

public class TestF {

	public static void main(String[] args) {
		
		Cow c=new Cow(1, "ganga", 5000);
		
		Cow c2=new Cow(2, "gowri", 6000);
		Cow c3=new Cow(1, "ganga", 5000);
		Cow c4=c3;
		
		System.out.println(c.equals(c2));
		System.out.println(c.equals(c3));
		System.out.println(c3.equals(c4));
		
	}
}
