package com.testyantra.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args, Object a1) {
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1, "Dhoni"));
		al.add(new Employee(2, "virat"));
		al.add(new Employee(1, "klrahul"));
		
		Comparator<Employee> cmp=(e2 , a2)->{
			return e2.name.compareTo(a2.name);
		};
		
		List<Employee> l=al.stream().sorted(cmp).collect(Collectors.toList());
		
		Iterator<Employee> i=l.iterator();
		while(i.hasNext()==true) {
			Employee e=i.next();
			System.out.println("id is:"+e.id);
			System.out.println("name is:"+e.id);
		}
	
		
	}
}
