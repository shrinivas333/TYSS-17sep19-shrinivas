package com.testyantra.objectclass;

public class TestD {

	public static void main(String[] args) {
		
		Student s1=new Student(10, "ranga", 50);
		
		int code=s1.hashCode();
		System.out.println(code);
		System.out.println(s1);
	}
}
