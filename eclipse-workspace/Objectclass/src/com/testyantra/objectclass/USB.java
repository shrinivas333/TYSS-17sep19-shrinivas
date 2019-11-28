package com.testyantra.objectclass;

public class USB {

		public static void connect(Object obj) {
			
			if(obj instanceof Pendrive) {
				Pendrive p=(Pendrive)obj;
				p.read();
				p.write();
			}else if(obj instanceof Mouse) {
				Mouse m=new Mouse();
				m.click();
				m.scroll();
			}else {
				System.out.println("Invlaid");
			}
		}
	
}
