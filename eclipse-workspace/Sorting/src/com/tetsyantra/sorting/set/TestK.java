package com.tetsyantra.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK {

public static void main(String[] args) {
		
//	Comparing using name
//		Comparator<Employee1> comp=(e1,e2)->{
//			String m=e1.name;
//			String n=e2.name;
//			return m.compareToIgnoreCase(n);
//			
//		};
		
//	Comparing using by id
		Comparator<Employee1> comp=(e1,e2)->{
			Integer m=e1.id;
			Integer n=e2.id;
			return m.compareTo(n);
			
		};
		
		
		
		TreeSet<Employee1> ts=new TreeSet<>(comp);
		
		ts.add(new Employee1(101, "nikii", 5.6));
		ts.add(new Employee1(102, "baskar", 5.2));
		ts.add(new Employee1(103, "suresh", 5.9));
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
