package com.tyss.capgemini.threads;

public class ComputerSystem1  extends Thread{
	PritingApplication printerApplication;
	public ComputerSystem1(PritingApplication localPrintingApplication) {
		// it is port where to use from print manchine thiis is tghe wire connected to printermanchine
		this.printerApplication = localPrintingApplication;
		
		 
	}
	
	@Override
	public void run() {
		System.err.println(">>>>Printing from computersystem1");
		printerApplication.pritingDocuments("someother.pdf", 10);
	}

}
