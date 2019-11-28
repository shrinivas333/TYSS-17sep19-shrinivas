package com.testyantra.typecasting.reference;

public class Marker extends Pen {

	double size;
	void color() {
		System.out.println("Marker Color()");
	}
	@Override
	void write() {
		System.out.println("Marker Write()");
	}
}
