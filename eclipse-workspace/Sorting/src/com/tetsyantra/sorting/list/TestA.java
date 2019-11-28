package com.tetsyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		
		Student s1=new Student(101, "SiMth", 66.5);
		Student s2=new Student(102, "diMple", 30.5);
		Student s3=new Student(103, "sweeTy", 55.5);
		Student s4=new Student(104, "JimmY", 76.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After sorting");
		displayStudentDetails(al);
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		
		Iterator<Student> i=al.iterator();
		while(i.hasNext()==true) {
			Student s =  i.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage"+s.percentage);
			System.out.println("===============================");
		}
	}
}
