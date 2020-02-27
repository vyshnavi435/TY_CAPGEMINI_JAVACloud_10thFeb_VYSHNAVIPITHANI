package com.tyss.capgemini.threads;

public class PrinterMachine {
	public static void main(String[] args) {

		System.out.println("+++++++++++++++Printer Machine Started+++++++++++++++++++++++++++++");
		PritingApplication pritingApplication = new PritingApplication();
		ComputerSystem1 computerSystem1 = new ComputerSystem1(pritingApplication);
		ComputerSystem2 computerSystem2 = new ComputerSystem2(pritingApplication);

		computerSystem1.start();
		try {
			computerSystem1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		computerSystem2.start();
		try {
			computerSystem2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("+++++++++++++++Printer Machine Stopped+++++++++++++++++++++++++++++");
	}

}
