package com.testyantra.objectclass;

public class TsetB {

	public static void main(String[] args) {
		
		Pen p=new Pen();
		int pHashCode=p.hashCode();
		System.out.println("Hash code of P"+pHashCode);
		
		Pen q=new Pen();
		int qHashCode=q.hashCode();
		System.out.println("Hash Code of q"+qHashCode);
		
	}

}

