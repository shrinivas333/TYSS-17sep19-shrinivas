package com.testyantra.collections.list;
import java.util.*;
public class TestJ {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(101,"salman",66);
		Student s2=new Student(102,"Sharukhan",56);
		Student s3=new Student(103,"ankita",86);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			Student s=al.get(i);
			System.out.println("Id is :"+s.id);
			System.out.println("Name is :"+s.name);
			System.out.println("percentage is :"+s.percentage);
			System.out.println("----------------------------------");
		}
		System.out.println("===========for each ===================");
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
