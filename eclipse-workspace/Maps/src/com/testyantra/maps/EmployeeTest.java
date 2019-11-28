package com.testyantra.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee s1=new Employee(101, "divya", 655.5);
		Employee  s2=new Employee (102, "Jhon", 555.4);
		Employee s3=new Employee (103, "joe", 305.6);
		Employee  s4=new Employee (104, "bing", 655.6);
		Employee  s5=new Employee (105, "ambika", 455.5);
		Employee  s6=new Employee (106, "giri", 655.5);
		Employee  s7=new Employee (107, "sweety", 575.6);
		Employee  s8=new Employee (108, "dimple", 575.2);
		Employee s9=new Employee (109, "chanda", 5750.0);
		
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Employee> al1=new ArrayList<Employee>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Employee> al2=new ArrayList<Employee>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
		HashMap<String, ArrayList<Employee>> hs=new HashMap<>();
		hs.put("Jhon", al);
		hs.put("Joe", al1);
		hs.put("Mounty", al2);
		
	ArrayList<Employee> ae	=hs.get("Joe");
	
	Iterator <Employee> i=ae.iterator();
	while(i.hasNext()==true) {
		Employee e=i.next();
		System.out.println("Id is :"+e.id);
		System.out.println("name is :"+e.name);
		System.out.println("slaray is :"+e.salary);
		System.out.println("+==========================");
	
	}
	
}
}
