package com.testyantra.collections.list;

public class Employee {

	int id;
	String name;
	double salary;
	long pno;
	public Employee(int id, String name, double salary, long pno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pno = pno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", pno=" + pno + "]";
	}
	
}
