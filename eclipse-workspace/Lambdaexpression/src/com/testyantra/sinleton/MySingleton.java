package com.testyantra.sinleton;

public class MySingleton {

	private static MySingleton instance=null;
	String s;
	private MySingleton() {
	
	}
	
	public static MySingleton getConnection() {
		
		if(instance==null) {
			instance=new MySingleton();
			return instance;
		}else {
			return instance;
		}
	}
}
