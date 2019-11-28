package com.testyantra.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Testc {

	public static void main(String[] args) {
		
		LinkedHashMap<String ,Integer> lh=new LinkedHashMap<String, Integer>();
		lh.put("Banglore", 560068);
		lh.put("Haiyana", 1234568);
		lh.put("Delhi", 880000);
		
		System.out.println(lh);
		Set<String> s=lh.keySet();
		
		for (String s1 : s) {
			System.out.println("key:"+s1);
		}
		Collection<Integer> vla=lh.values();
		for (Integer i : vla) {
			System.out.println("values:"+i);
		}
	}
}
