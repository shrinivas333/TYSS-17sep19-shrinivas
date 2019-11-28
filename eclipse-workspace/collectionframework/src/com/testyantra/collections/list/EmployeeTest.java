package com.testyantra.collections.list;

import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "Abhi", 5200, 1234452);
		Employee e2=new Employee(2, "Banu", 5500, 6654452);
		Employee e3=new Employee(3, "chetan", 8500, 134456552);
		Employee e4=new Employee(4, "prasad", 8302, 1234452);
		
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println(al);
		
		System.out.println("using a for loop");
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
			
		System.out.println("Using a for Each loop");
			for (Object o : al) {
				System.out.println(o);
			}
		System.out.println("using iterator");
		Iterator i=al.iterator();
		
			while(i.hasNext()==true) {
				System.out.println(i.next());
			}
	}
}