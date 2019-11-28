package com.testyantra.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		
		Pen p=new Pen();
		p.write();
		System.out.println("=================");
		
		Pen p1=new Marker();//up casting 
		p1.write();
		System.out.println(p1.cost);
		System.out.println("=================");
		
		Marker m=(Marker)p1;//down casting
		m.color();
		m.write();
		System.out.println(m.cost);
		System.out.println(m.size);
		
	}
}
