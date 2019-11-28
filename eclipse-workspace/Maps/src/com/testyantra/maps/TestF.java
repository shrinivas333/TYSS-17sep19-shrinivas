package com.testyantra.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestF {

	public static void main(String[] args) {
		//sorted the data
		TreeMap<String ,Integer> lh=new TreeMap<String, Integer>();
		
		lh.put("Hariyana", 1234568);
		lh.put("Delhi", 880000);
		lh.put("Banglore", 560068);
//		lh.put(null, 456666); NullPointerException
		
		System.out.println(lh);
		
		for (Map.Entry<String, Integer> m:lh.entrySet()) {
			
			String key=m.getKey();
			Integer value=m.getValue();
			
			System.out.println("key is.. "+key+" value is .."+value);
		}
	}
}
