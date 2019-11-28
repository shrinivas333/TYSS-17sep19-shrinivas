package com.testyantra.atmmachine;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("ICICI validate()");
	}
	@Override
	public void getInfo() {
		System.out.println("ICICI getInfo()");
	}
}
