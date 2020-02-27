package com.tyss.capgemini.Inheritance;

public interface FunctionalInterfaceExample {        
	
	public void ShowMessage();
	
	default void displayMessage()
	{
		System.out.println("default displayMessage of FunctionalInterfaceExample ");
	}
	
	public static void printMessage()
	{
		System.out.println(" public static printMessage of FunctionalInterfaceExample ");
	}

}
