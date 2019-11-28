package com.testyantra.hasrelation.car;

public class TestB {

	public static void main(String[] args) {
		
		Car c= new Car();
		c.move();
		c.stop();
		System.out.println(c.price);
		
		System.out.println("*****************");
		c.m.play(); // Has a Relation
		System.out.println(c.m.song);
		c.m.stop();
		
	}
}
