package com.testyantra.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();

		al.add("Girirja");
		al.add("vanija");
		al.add("Pooja");
		al.add("kiran");
		
		System.out.println("Before sorting"+al);
		Collections.sort(al);
		System.out.println("After sortinf :"+al);
		
	}
}
