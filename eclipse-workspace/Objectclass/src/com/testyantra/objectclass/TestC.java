package com.testyantra.objectclass;

public class TestC {

	public static void main(String[] args) {
		
		Marker m=new Marker();
		int mHashCode=m.hashCode();
		String Mtosring=m.toString();
		System.out.println(Mtosring);
		System.out.println("hash code="+mHashCode);
		
	}
}
