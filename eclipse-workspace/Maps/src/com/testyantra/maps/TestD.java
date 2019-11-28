package com.testyantra.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		
		LinkedHashMap<String ,Integer> lh=new LinkedHashMap<String, Integer>();
		lh.put("Banglore", 560068);
		lh.put("Haiyana", 1234568);
		lh.put("Delhi", 880000);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			
			String key=m.getKey();
			Integer value=m.getValue();
			
			System.out.println("key is.. "+key+" value is .."+value);
		}
		
	}
}
