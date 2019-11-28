package com.tetsyantra.sorting.set;

import java.util.Comparator;
import java.util.*;


public class Employee1Test {

	public static void main(String[] args) {
		
		Comparator<Employee1> comp=(e1,e2)->{
			if(e1.height>e2.height)
				return 1;
			else if(e1.height<e2.height)
				return -1;
			else
				return 0;
		};
		
		
		
		TreeSet<Employee1> ts=new TreeSet<>(comp);
		
		ts.add(new Employee1(101, "nikii", 5.6));
		ts.add(new Employee1(102, "baskar", 5.2));
		ts.add(new Employee1(103, "surehs", 5.9));
		ts.add(new Employee1(104, "dinesh", 4.5));
		
		System.out.println("******using a iterator***");
		
		Iterator<Employee1> i=ts.iterator();
			while(i.hasNext()==true) {
				Employee1 e1=i.next();
				System.out.println("employee id is:"+e1.id);
				System.out.println("Employee name is :"+e1.name);
				System.out.println("employee height is :"+e1.height);
				System.out.println("++++++++++++++++++++++++++++++++");
			}
		
		
	}
}
