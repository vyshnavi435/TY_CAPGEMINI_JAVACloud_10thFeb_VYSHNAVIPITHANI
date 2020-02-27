package com.tyss.capgemini.Inheritance;

public interface MethodInterface {
	
	public  void displaymessage();
	public  void printmessage();
	
	public static void showMessage()
	{
		System.out.println("public static shoeMessage() of MethodInterface.. ");
	}
		
	default void defaultMethodMessage() {
		System.out.println("defaultMethodMessage() of MethodInterface..");
	}
	
	

}
