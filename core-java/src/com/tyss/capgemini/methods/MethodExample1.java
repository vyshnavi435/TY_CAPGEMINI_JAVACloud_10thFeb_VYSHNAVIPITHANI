package com.tyss.capgemini.methods;

public class MethodExample1 {
	//called method
	public static void displayMessage() 
	{
		System.out.println("Execution comes to display method");
		System.out.println("HELLO");
		System.out.println("End of displayMessage method");
		
	}
	//calling method
	public static void main(String[] args)
	{
		System.out.println("display method message is called");
		displayMessage();
		System.out.println("End of main method");
	}


/* we cannot create a method inside a method
 * public static void name()
{
	public static void name1
	{
		
	}*/
}