package com.tyss.capgemini.Inheritance;

public class InterfaceImplClass  implements MethodInterface, AnotherMethodInterface {
	                                                           
	//if you want to inherit the properties of Inherotance
	 @Override
	public void displaymessage() {
		System.out.println("Overriden displaymessage() of MethodInterafce");
		
	}
	 @Override
	public void printmessage() {
		System.out.println("overriden printmessage() of MethodInterface");
		
	 }
	 
	 @Override
	public void messagedisplay() {
		System.out.println("overriden messagedisplay of AnotherMethodInterafce");
		
	    }
	 
public static void main(String[] args) {
	MethodInterface  m= new InterfaceImplClass();
	m.displaymessage();
	m.printmessage();
//	InterfacesImplClass implclass= new InterfacesImpClass();
//	implclass.displayMessage();
//	implclass.printMessage();
//	impclass.messageDisplay();
	
	
	
	
	
}
} 
