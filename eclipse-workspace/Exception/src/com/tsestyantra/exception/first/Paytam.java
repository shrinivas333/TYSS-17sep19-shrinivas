package com.tsestyantra.exception.first;

public class Paytam {

	void book() {
		System.out.println("Paytam started");
		
		IRCTC r=new IRCTC();
		r.confirm();
		
		System.out.println("Paytam ended");
	}
}
