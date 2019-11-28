package com.testyantra.Arrays;

public class TestA {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("==========================");
		
		for (int i : num) {
			System.out.println(i);
		}
		
		char ch[]= {'a','b','c','d'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("======================");
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("======================");
		byte b[]= {1,5,6,7,8,5};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("======================");
		for (byte c : b) {
			System.out.println(c);
		}
		System.out.println("======================");
		
		double d[]= {1.1,1.2,2.1,2.2};
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("======================");
		for (double e : d) {
			System.out.println(e);
		}
		
		System.out.println("======================");
		
		String names[]= {"sandhya","pooja","chaitra","kavya"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("======================");
		for (String string : names) {
			System.out.println(string);
		}
	}
}
