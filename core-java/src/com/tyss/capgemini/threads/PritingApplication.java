package com.tyss.capgemini.threads;

public class PritingApplication {
	synchronized public void pritingDocuments(String document, int numOfCopies) {
		for(int i =1; i<+numOfCopies;i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(">>priting"+document+ "#" + i);
		}
		
	}

}
