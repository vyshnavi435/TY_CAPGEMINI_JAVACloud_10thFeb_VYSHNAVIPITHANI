package com.tyss.capgemini.Inheritance;

public class FunctionalInterfaceImp1 implements FunctionalInterfaceExample, FunctionalInterfaceExample2{
	
	@Override
	public void ShowMessage() {
		System.out.println("ovveriden of showmesage of functionalinterface");
		
	}
	@Override
	public int add(int i, int j) {
		
		return i+j;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		FunctionalInterfaceImp1 f = new FunctionalInterfaceImp1();
		f.ShowMessage();
		f.displayMessage();
		
		FunctionalInterfaceExample.printMessage();
		
		System.out.println(f.add(4,5));
		
		FunctionalInterfaceExample2.print();
		
		
		
		
	}
	
	

}
