package com.testyantra.hasrelation.weak;

public class TestA {

	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println(p.name);
		p.sleep();
		System.out.println("****************");
		
		p.m.write(); //Has a Relation
		System.out.println(p.m.color);
		System.out.println(p.m.size);
	}
}
