package com.testyantra.function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {
		
		Iterator<Student> i=al.iterator();
		
		while(i.hasNext()==true) {
			
			Student s=i.next();
			System.out.println("Id is :"+s.id);
			System.out.println("Name is :"+s.name);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("=================================");
		}
	}
	
  void	displayFailedStudents(ArrayList<Student> al) {
	  
   List<Student> l=al.stream().filter(i->i.percentage<40).collect(Collectors.toList());
  
   Iterator<Student> i=l.iterator();
	
	while(i.hasNext()==true) {
		
		Student s=i.next();
		System.out.println("Id is :"+s.id);
		System.out.println("Name is :"+s.name);
		System.out.println("Percentage is :"+s.percentage);
		System.out.println("=================================");
	}
  
  }
  
  void	displayPassStudents(ArrayList<Student> al) {
	  
	   List<Student> l=al.stream().filter(i->i.percentage>40).collect(Collectors.toList());
	  
	   Iterator<Student> i=l.iterator();
		
		while(i.hasNext()==true) {
			
			Student s=i.next();
			System.out.println("Id is :"+s.id);
			System.out.println("Name is :"+s.name);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("=================================");
		}
	  
	  }
  

  
  
  
  void	topperOfclass(ArrayList<Student> al) {
	  
	  Comparator<Student> cmp=(m1,m2)->{
			
		  if(m1.percentage>m2.percentage)
			  return 1;
		  else if (m1.percentage<m2.percentage)
			  return -1;
		  return 0;
	  };
	  
	   Student i=al.stream().max(cmp).get();
	  
	   System.out.println("TOpper is:"+i.name);
	  
	  }
}
