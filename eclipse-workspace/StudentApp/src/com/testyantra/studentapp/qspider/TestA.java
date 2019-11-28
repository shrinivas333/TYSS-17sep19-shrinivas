package com.testyantra.studentapp.qspider;
import com.testyantra.studentapp.jspider.*;



public class TestA {

	
	public static void main(String[] args) {
		
		QTP q=new QTP();
		q.teachQTP();
		
		Selenium s =new Selenium();
		s.teachSelenium();
		
//		com.testyantra.studentapp.jspider.Angular a= new com.testyantra.studentapp.jspider.Angular();
//		a.teachAngular();
//		com.testyantra.studentapp.jspider.Angular a1= new com.testyantra.studentapp.jspider.Angular();
//		a1.teachAngular();
		
		Angular a =new Angular();
		a.teachAngular();
		
		React r= new React();
		r.teachReact();
	
	}
}
