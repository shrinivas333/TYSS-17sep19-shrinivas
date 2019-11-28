package com.testyantra.objectclass;

public class TestG {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "ravi", 100.25);
		Employee e2=new Employee(2, "raju", 1000.33);
		Employee e3=new Employee(1, "ravi", 100.25);
		
		System.out.println(e1.equals(e2));

		System.out.println(e1.equals(e3));

		System.out.println(e2.equals(e3));
		
		System.out.println(e1);
		System.out.println(e1);
		System.out.println(e1);
	}
}
