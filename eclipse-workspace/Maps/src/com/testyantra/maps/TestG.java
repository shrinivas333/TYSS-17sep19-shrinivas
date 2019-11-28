package com.testyantra.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		Student s1=new Student(101, "divya", 65.5);
		Student s2=new Student(102, "Jhon", 55.5);
		Student s3=new Student(103, "joe", 30.5);
		Student s4=new Student(104, "bing", 65.5);
		Student s5=new Student(105, "ambika", 45.5);
		Student s6=new Student(106, "giri", 65.5);
		Student s7=new Student(107, "sweety", 57.5);
		Student s8=new Student(108, "dimple", 57.5);
		Student s9=new Student(109, "chanda", 57.5);
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
		HashMap<String, ArrayList<Student>> hs=new HashMap<>();
		hs.put("First", al);
		hs.put("Second", al1);
		hs.put("Third", al2);
		
		ArrayList<Student> a=hs.get("First");
		Iterator <Student> i=a.iterator();
		while(i.hasNext()==true) {
			Student s=i.next();
			System.out.println("Id is :"+s.id);
			System.out.println("name is :"+s.name);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("+==========================");
		}
	}
}
