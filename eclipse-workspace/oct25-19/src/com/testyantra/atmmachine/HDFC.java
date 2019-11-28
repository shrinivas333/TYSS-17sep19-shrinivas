package com.testyantra.atmmachine;

public class HDFC implements ATM{
	@Override
	public void validateCard() {
		System.out.println("Hdfc validate()");
	}
	@Override
	public void getInfo() {
		System.out.println("Hdfc getInfo()");
	}
}
