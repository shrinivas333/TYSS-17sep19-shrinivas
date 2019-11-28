package com.testyantra.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("main started");
		
		MyJoinThread mj=new MyJoinThread();
		mj.start();
		try {
			mj.join(10000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		
		System.out.println("main ended");
	}

}
