package com.testyantra.function;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101, "vikiram", 76.5));
		al.add(new Student(102, "jay", 36.5));
		al.add(new Student(103, "sneha", 86.5));
		al.add(new Student(104, "momo", 12.5));
		al.add(new Student(105, "nidhi", 26.5));
	
		Helper h=new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudents(al);
//		h.displayPassStudents(al);
		h.topperOfclass(al);
}
}