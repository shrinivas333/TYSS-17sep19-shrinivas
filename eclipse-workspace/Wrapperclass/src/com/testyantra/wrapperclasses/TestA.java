package com.testyantra.wrapperclasses;

import javax.swing.text.StyledEditorKit.BoldAction;

public class TestA {

	public static void main(String[] args) {
		
		int a=10;
		System.out.println("a is:"+a);
		
		Integer i=a;//auto boxing or Boxing
		System.out.println("i is: "+i);
		
		Integer x=20;
		Integer z=new Integer(10);
		System.out.println("z is :"+z);
		System.out.println("x is :"+x);
		int y=x;//unboxing or AutoUnboxing
		System.out.println("y is:"+y);
		
		int value=Integer.parseInt("123");
		System.out.println("value :"+value);
		
		boolean result=Boolean.parseBoolean("true");
		System.out.println("result:"+result);

	}
}
