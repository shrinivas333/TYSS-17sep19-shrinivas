package com.testyanra.customized.uncheckedException;

public class Validator {

	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException("Try again next time!");
		}
	}
}
