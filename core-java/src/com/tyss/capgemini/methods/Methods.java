package com.tyss.capgemini.methods;

public class Methods {
	public static String displayMessage()
	{
		return "Static displayMessage()";
		
	}
	public String printMessage() {
		return "non-static Methods.printMessage()";
	}
	
	int addingTwoIntegers(int i, int j) {
	
		return i+j;
	}
	protected  String welcomeMessage() {
		return "hello world";
	}
	
	private String messagedisplay() {
		return "private messageDisplay()";
	}
	
}
