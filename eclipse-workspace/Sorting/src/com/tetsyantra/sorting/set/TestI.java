package com.tetsyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
//		SortByName sb=new SortByName();//sorting by name
//		SortByPincode sp=new SortByPincode();//sorting by pincode
		SortByMicr sm=new SortByMicr();
		TreeSet<Bank> ts =new TreeSet<Bank>(sm);
		
		Bank b1=new Bank("HDFC", 560068, 6788898);
		Bank b2 =new Bank("SBI", 560071, 79543636);
		Bank b3=new Bank("CANARA", 560076, 8664255);
		Bank b4=new Bank("CITII", 560064, 1234566);
		Bank b5=new Bank("CITII", 560064, 1234566);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);

		
		System.out.println("****using iterator");
		
		Iterator<Bank> i=ts.iterator();
		
		while(i.hasNext()==true) {
			Bank b=i.next();
			System.out.println("Bank name is :"+b.name);
			System.out.println("Bank pincode is : "+b.pincode);
			System.out.println("Bank Micr code is "+b.micr);
			System.out.println("+++++++++++++++++++++++++++++");
		}
	}
}
