package com.testyantra.objectclass;

public class Employee {

	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public boolean equals(Object obj) {
		
		Employee e=(Employee)obj;
		
		if(this.id == e.id) {
			if(this.name.equals(e.name)) {
				if(this.sal == e.sal) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
