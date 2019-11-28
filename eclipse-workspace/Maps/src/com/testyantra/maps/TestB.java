package com.testyantra.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("kuku", 98546857);
		hm.put("mala", 56475955);
		hm.put("sheela", 879456450);
		
		HashMap hm1=new HashMap();
		hm1.put("deepu", 7809990);
		hm1.put("chandana", 54564656);
		hm1.put("joe", 515456);
		
		boolean haskey=hm.containsKey("mala");
		System.out.println(" Has key:"+haskey);
		
		boolean hasvalue=hm.containsValue(985467);
		System.out.println(" Has value:"+hasvalue);
		
		hm.putAll(hm1);
		
		System.out.println("===================================");
		
		System.out.println("After put all:"+hm);
		
		System.out.println(hm.size());
		
		boolean isempty=hm.isEmpty();
		System.out.println("HashMap is empty:"+isempty);
		
		hm.clear();
		System.out.println("After clear method"+hm);
	}
}
