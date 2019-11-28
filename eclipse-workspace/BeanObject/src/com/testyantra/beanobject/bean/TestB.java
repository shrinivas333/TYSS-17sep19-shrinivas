package com.testyantra.beanobject.bean;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("age is :"+age);
		
//		System.out.println("Enter a Name");
//		String name=sc.nextLine();
//		System.out.println("Name is :"+name);
//		
		System.out.println("Enter a LastName");
		String Lname=sc.next();
		System.out.println("Lastname is :"+Lname);
	}
}
