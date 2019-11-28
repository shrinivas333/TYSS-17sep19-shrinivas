package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {

	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<>();
		
		Employee e1=new Employee(101, "sweety", 45000);
		Employee e2=new Employee(102, "teju", 50000);
		Employee e3=new Employee(103, "giri", 30000);
		Employee e4=new Employee(104,"sheela",40000);
		Employee e5=new Employee(104,"sheela",40000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		

		System.out.println("**** using for each ****");
		for (Employee o : ts) {
			System.out.println(o);
		}
		
		System.out.println("***using Iterator**********");
		Iterator<Employee> i=ts.iterator();
		while(i.hasNext()==true) {
			Employee e= i.next();
			System.out.println("Id is :"+e.id);
			System.out.println("Name is :"+e.name);
			System.out.println("Salary is"+e.salary);
			System.out.println("++++++++++++++++++++++++++++");
		}
		
	}
}
