package com.testyantra.beanobject.bean;

import com.testyantra.beanobject.employee.Employee;

public class TestA {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(12);
		s.setName("shivagami");
		s.setRollno(123);
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("suresh");
		e1.setSalary(12000);
		e1.setDept("developer");
		e1.setDesignation("Software developer");
		
		
		Database d=new Database();
		d.receive(s);
		System.out.println("********************");
		d.save(e1);
	}
}
