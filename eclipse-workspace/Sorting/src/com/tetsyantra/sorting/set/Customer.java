package com.tetsyantra.sorting.set;

public class Customer implements Comparable<Customer> {

	String name;
	int id;
	double salary;
	public Customer(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public int compareTo(Customer c) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(c.name);
	}
	
}
