package com.tyss.capgemini.polymorphism;

public class MethodsInterfaceCaller {
	public static void main(String[] args) {
		
	
	MethodOverridingClass2 methodOverridingClass2 = new MethodOverridingClass2();
	MethodOverridingClass1 methodOverridingClass1 = new MethodOverridingClass1();
	
	System.out.println(methodOverridingClass2.displayMessage());
	System.out.println(methodOverridingClass2.printMessage());
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"); 
	//we dont know the implementtion behind println is a abstraction itself
	// behind this how it is implementation of display and print method behind that how it is working it is called method hinding
	
	System.out.println(methodOverridingClass1.displayMessage());
	System.out.println(methodOverridingClass1.displayMessage());
	   
	}
}
