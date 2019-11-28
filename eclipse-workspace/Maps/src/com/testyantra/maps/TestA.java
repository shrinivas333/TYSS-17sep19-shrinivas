package com.testyantra.maps;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("kuku", 98546857);
		hm.put("mala", 56475955);
		hm.put("sheela", 879456450);
		hm.put(null, 8794450);
		System.out.println("Data="+hm);

		hm.put("mala", 98545622);
		System.out.println("After modify"+hm);
		hm.put("dimple", 98545622);
		System.out.println("After Dimple"+hm);
		hm.put(null, 879456450);
		System.out.println("After null"+hm);
		
		System.out.println("Phone Number:"+hm.get("sheela"));
		System.out.println("Phone Number:"+hm.get("sheel"));
		
		System.out.println("Removed Object:"+hm.remove("sheela"));
		System.out.println("After removed:"+hm);
	}
}
