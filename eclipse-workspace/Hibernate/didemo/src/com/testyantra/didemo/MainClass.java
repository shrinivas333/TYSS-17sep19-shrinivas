package com.testyantra.didemo;

import com.testyantra.didemo.dao.I;
import com.testyantra.didemo.util.Manger;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manger manger=new Manger();
		I i=manger.getI();
		i.m1();
		i.m2();
		i.m3();
	}

}
