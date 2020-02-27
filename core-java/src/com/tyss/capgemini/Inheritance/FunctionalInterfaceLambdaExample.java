package com.tyss.capgemini.Inheritance;

public class FunctionalInterfaceLambdaExample   {
	
	static String string = "Lambda Expression Example for FunctionalInterfaceExample ";
	
	static FunctionalInterfaceExample functionalInterface = ()-> {
			
				System.out.println(string);
				System.out.println("another line of impl.. ");
			 };
			 
			 static FunctionalInterfaceExample2 f = (i, j)-> i+j;
			 
					
		public static void main(String[] args) {
		functionalInterface.displayMessage();
		functionalInterface.ShowMessage();
		int i = f.add(12,12);
		System.out.println(i);
		
		FunctionalInterface
		
		System.out.println(f.add(5, 6));
		
		
		
		
		
	}
			

}
