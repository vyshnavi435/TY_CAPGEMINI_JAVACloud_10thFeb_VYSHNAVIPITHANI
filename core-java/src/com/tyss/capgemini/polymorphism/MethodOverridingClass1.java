package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass1 implements MethodsInterface{
	@Override
	public String displayMessage() {
		
		return "Overriden displaymessage of MethodsInterface  from MethodOverridingClass1";
	}
	
	@Override
	public String printMessage() {
		
		return "Overriden displaymessage of MethodsInterface  from MethodOverridingClass2";
	}
	

}
