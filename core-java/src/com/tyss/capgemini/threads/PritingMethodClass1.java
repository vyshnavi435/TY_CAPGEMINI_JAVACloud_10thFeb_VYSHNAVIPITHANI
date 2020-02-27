package com.tyss.capgemini.threads;

public class PritingMethodClass1 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		for (int i = 1; i < 10; i++) {
			System.out.println("print value :" + i);
		}
	}

}
