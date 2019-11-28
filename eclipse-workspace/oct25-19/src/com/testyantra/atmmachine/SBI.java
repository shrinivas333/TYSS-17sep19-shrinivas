package com.testyantra.atmmachine;

public class SBI implements ATM {
	
	@Override
	public void validateCard() {
		System.out.println("SBI validatecard()");
	}
	@Override
	public void getInfo() {
		System.out.println("SBI getInfo()");
	}
}
