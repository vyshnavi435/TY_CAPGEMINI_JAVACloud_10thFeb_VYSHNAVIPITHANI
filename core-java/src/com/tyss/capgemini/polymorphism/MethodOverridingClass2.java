package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass2 implements MethodsInterface {
	@Override
	public String displayMessage() {
		
		return "Overriden displaymessage of MethodsInterface  from MethodOverridingClass2";
	}
	@Override
	public String printMessage() {
		
		return "Overriden printmessage of MethodsInterface  from MethodOverridingClass2";
	}
	

}
