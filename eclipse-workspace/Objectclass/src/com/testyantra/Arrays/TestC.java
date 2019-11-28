package com.testyantra.Arrays;

public class TestC {

	public static void main(String[] args) {
		
		Student s1= new Student(1, "santu", 85);
		Student s2= new Student(2, "nithin",55.36);
		Student s3= new Student(3, "manku", 66.25);
		
		Student[] students=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		recieve(students);
		System.out.println("++++++++++++++++++++++++++++++++++");
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
	static void recieve(Student[] stu) {
		for (Student s : stu) {
			System.out.println(s);
		}
	}
}
