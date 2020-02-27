package com.tyss.capgemini.threads;

public class PrintingValues {

	public static void main(String[] args) {
		System.out.println("+++++++Application started+++++++++++++");
		
		PritingMethodClass1 pritingMethodClass1 = new PritingMethodClass1();
		try {
			pritingMethodClass1.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pritingMethodClass1.start();
		
		Thread thread = new Thread(new PrintingMethodClass2());
		try {
			thread.join();
		} catch (InterruptedException e1) {
		   e1.printStackTrace();
		}
		thread.start();
		try {
			thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println("+++++++++++++Application end+++++++++++++++++++++++++");
	}

}
