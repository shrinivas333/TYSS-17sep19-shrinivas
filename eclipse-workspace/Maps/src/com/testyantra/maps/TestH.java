package com.testyantra.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "Ajay");
		ht.put(102, "vijay");
		ht.put(100, "sonu");
		ht.put(99, "monu");
		ht.put(101, "shriram");
		ht.put(105, "shriram");
		ht.put(20, "monu");
		ht.put(51, "monu");
		ht.put(89, "monu");
		ht.put(400, "monu");
		ht.put(500, "monu");
		
//		ht.put(null, "jhon");//null pointer exception
//		ht.put(105, null);  null pointer Exception
		
		System.out.println(ht);
		
	}
}
