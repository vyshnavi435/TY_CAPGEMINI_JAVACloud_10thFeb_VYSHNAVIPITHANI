package com.tyss.capgemini.Inheritance;

public interface FunctionalInterfaceExample2 {
	public int add(int i, int j);
		
	public static void print()
	{
		System.out.println("print() of FunctionalInterfaceExample2  ");
	}
	
	public static void messageDisplay()
	{
		System.out.println("messageDisplay() of FunctionalInterfaceExample2  ");
	}
	
	default void play()
	{
		
	}

}
