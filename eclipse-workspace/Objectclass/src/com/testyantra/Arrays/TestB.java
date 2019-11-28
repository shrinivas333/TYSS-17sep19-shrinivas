package com.testyantra.Arrays;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {10,20,30,40};
//		System.out.println(nums[10]); Array indexoutofbound Exception
		recive(nums);
		int[] a=getArray();
		recive(a);
		
		String s[]= {"java","javascript","c","c++"};
		recive(s);
		String s1[]=getstringArray();
		recive(s1);
		}
	static void recive(int[] number) {
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			
		}
		System.out.println("++++++++++++++++++++++++++++++");
	}
	static int[] getArray() {
		int values[]= {10,50,60,80};
		return values;
	}
	
	static void recive(String[] lan) {
	for (String string : lan) {
		System.out.println(string);
	}
		System.out.println("++++++++++++++++++++++++++++++");
	}
	static String[] getstringArray() {
		String s[]= {"java","javascript","c","c++"};
		return s;
	}

}


