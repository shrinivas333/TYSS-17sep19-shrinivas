package com.testyanra.customized.uncheckedException;

public class TestAge {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		Validator v=new Validator();
		try {
		v.verify(15);
		}catch(InvalidAgeException age) {
			System.out.println("Below age ");
		}
		v.verify(13);
		System.out.println("main ended");
	}
}
