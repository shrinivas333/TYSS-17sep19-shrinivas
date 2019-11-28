package com.testyantra.sinleton;

public class TestA {

	public static void main(String[] args) {
		
		String s1="hello";
		MySingleton ms=MySingleton.getConnection();
		ms.s="hello";
		System.out.println("Hashcode of ms object"+ms.hashCode());
		
		MySingleton ms1=MySingleton.getConnection();
		System.out.println("Hashcode of ms1 object"+ms1.hashCode());
	}
}
