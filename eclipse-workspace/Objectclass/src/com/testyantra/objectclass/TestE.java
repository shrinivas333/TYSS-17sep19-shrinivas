package com.testyantra.objectclass;

public class TestE {

	public static void main(String[] args) {
		
		Car c1=new Car(8000,"Bmv" ,"black");
		Car c2=new Car(3000,"maruti" ,"white");
		Car c3=new Car(4000,"nano" ,"blue");
		
		int c1code=c1.hashCode();
		System.out.println(c1code);
		System.out.println(c1);
		

		int c2code=c2.hashCode();
		System.out.println(c2code);
		System.out.println(c2);
		

		int c3code=c3.hashCode();
		System.out.println(c3code);
		System.out.println(c3);
		
	}
}
