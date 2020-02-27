package com.tyss.capgemini.Inheritance;
import com.tyss.capegemini.primitivedatatypes.BasicArthematicOperation;

public class SomeArthematicOperations extends BasicArthematicOperation {
	public SomeArthematicOperations(){
		 super();
		System.out.println("someArthematicopertsaions");
		
	}
	
	public static void main(String[] args) 
	{
		
		SomeArthematicOperations s = new SomeArthematicOperations(); 
		System.out.println("add method of superclass " + add(45,87));
		
	}
	
	
	

}
