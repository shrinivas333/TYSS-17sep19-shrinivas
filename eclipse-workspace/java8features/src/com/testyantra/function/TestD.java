package com.testyantra.function;

import java.util.function.Consumer;

public class TestD {

	public static void main(String[] args) {

		Consumer<Student> c=(s)->{
			System.out.println("Id is:"+s.id);
			System.out.println("name is:"+s.name);
			System.out.println("Percentage is:"+s.percentage);
		};
		Student s=new Student(101, "kavya", 55);
		c.accept(s);
	}

}
