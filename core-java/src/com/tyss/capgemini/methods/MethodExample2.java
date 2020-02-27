package com.tyss.capgemini.methods;

public class MethodExample2 {
	private void displayMessage() {
      System.out.println("Start of displayMessage()");
      System.out.println("Hello world");
      System.out.println("End of display ");
      System.out.println("Returning to calling mrthod");
      
	}
	public static void main(String[] args)
	{
		MethodExample2 methodExample2 = new MethodExample2();
		System.out.println("called display() via object..");
		methodExample2.displayMessage();
		System.out.println("End of main method..");
		
	}
}
