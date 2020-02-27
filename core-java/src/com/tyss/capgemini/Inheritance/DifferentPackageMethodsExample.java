package com.tyss.capgemini.Inheritance;
import com.tyss.capegemini.primitivedatatypes.BasicArthematicOperation;

public class DifferentPackageMethodsExample  extends  BasicArthematicOperation{
	public static void main(String[] args) 
	{
		DifferentPackageMethodsExample d= new DifferentPackageMethodsExample();
		System.out.println(d.toString());
		System.out.println(d.hashCode());
		System.out.println("ADD METHOD OF SUPERCLASS : " +add(8, 9));
		
		
		
	




		// BasicArthematicOperation.add(4, 5);
		// add(8,9);
	}

}
