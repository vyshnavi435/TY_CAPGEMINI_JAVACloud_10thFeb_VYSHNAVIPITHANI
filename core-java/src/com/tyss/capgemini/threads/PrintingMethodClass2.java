package com.tyss.capgemini.threads;

public class PrintingMethodClass2 implements Runnable {

	@Override
	public void run() {

		System.out.println("");
		for (int i = 1; i < 10; i++) {
			System.err.println("Printing Value: " + i);
		}

	}
}
