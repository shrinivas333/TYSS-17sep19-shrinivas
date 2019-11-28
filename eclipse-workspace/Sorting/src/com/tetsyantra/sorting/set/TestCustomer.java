package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCustomer {

	
	public static void main(String[] args) {
		
		TreeSet<Customer> ts =new TreeSet<Customer>();
		
		ts.add(new Customer("Santosh", 1, 20000));
		ts.add(new Customer("Abhi", 2, 60000));
		ts.add(new Customer("Jhon", 3, 30000));
		ts.add(new Customer("Shree", 4, 50000));
		
		
	System.out.println("****using iterator");
		
		Iterator<Customer> i=ts.iterator();
		
		while(i.hasNext()==true) {
			Customer c=i.next();
			System.out.println("Customer name is :"+c.name);
			System.out.println("Customer id is : "+c.id);
			System.out.println("salary is "+c.salary);
			System.out.println("+++++++++++++++++++++++++++++");
		}
		
	}
}
