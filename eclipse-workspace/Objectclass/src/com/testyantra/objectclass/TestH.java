package com.testyantra.objectclass;

public class TestH {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p=new Person(1, "Ravi");
		System.out.println("id is :"+p.id);
		System.out.println("name is "+p.name);
		
		Object	 o = p.clone();
		
		Person p2=(Person)o;
		
		System.out.println("p2 id is :"+p2.id);
		System.out.println("p2 name is :"+p2.name);
		p2.id=2;
		p2.name="raju";
		System.out.println("---------After cloning---------------");
		System.out.println("id is :"+p.id);
		System.out.println("name is "+p.name);
		System.out.println("p2 id is :"+p2.id);
		System.out.println("p2 name is :"+p2.name);
		
		
	}
}
