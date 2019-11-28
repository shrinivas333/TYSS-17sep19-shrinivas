package com.testyantra.function;

import java.util.function.Function;

public class TestB {

	public static void main(String[] args) {
		
		Function<Integer, Student> f=id->{
			Student s=new Student(2, "vijay", 55.6);
			s.id=id;
			return s;
		};
		Student s=f.apply(27);
		System.out.println("Id is:"+s.id);
		System.out.println("name is:"+s.name);
		System.out.println("Percentage is:"+s.percentage);
		
	}
}
