package com.tetsyantra.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		HashSet<Employee> hs=new HashSet<>();
		
		Employee e1=new Employee(101, "sweety", 45000);
		Employee e2=new Employee(102, "teju", 50000);
		Employee e3=new Employee(103, "giri", 30000);
		Employee e4=new Employee(104,"sheela",40000);
		Employee e5=new Employee(104,"sheela",40000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		

		System.out.println("**** using for each ****");
		for (Employee o : hs) {
			System.out.println(o);
		}
		
		System.out.println("***using Iterator**********");
		Iterator<Employee> i=hs.iterator();
		while(i.hasNext()==true) {
			Employee e= i.next();
			System.out.println("Id is :"+e.id);
			System.out.println("Name is :"+e.name);
			System.out.println("Salary is"+e.salary);
			System.out.println("++++++++++++++++++++++++++++");
		}
		
	}
}
