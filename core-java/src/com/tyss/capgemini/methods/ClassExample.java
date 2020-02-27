package com.tyss.capgemini.methods;

public class ClassExample {
	//zero argument constructor
	public ClassExample() {
		System.out.println("Zero-Argument Constructor..");
		
		}
		// Parameterized constructor ; CONSTRUCTER OVERLOADING
	public ClassExample(String string) {
		System.out.println("Constructor with one string input..");
		
		}
	public ClassExample(String string, int i ) {
		System.out.println("Constructor with one string & one int input..");
		
		}
	//@SUPPRESS WARNINGS("UNUSED")
	public static void main(String[] args)
	{
		ClassExample classExample3 =new ClassExample();
		ClassExample classExample1 =new ClassExample("Any String");
		ClassExample classExample2=new ClassExample("Any String, 1234");
		
	}
	
		

}
