package com.tyss.capgemini.Inheritance;

public class MethodInterfaceJ8Impl implements MethodInterface {

	@Override
	public void displaymessage() {
		System.out.println("Overriden displaymessage() of MethodInterface.. ");

	}

	// we need object of implementation class to create object
	@Override
	public void printmessage() {
		System.out.println("Overriden printmessage() of MethodInterface.. ");

	}
	public static void main(String[] args) 
	{
		MethodInterfaceJ8Impl methodsInterfaceJ8Iml = new MethodInterfaceJ8Impl();
		methodsInterfaceJ8Iml.displaymessage();
		methodsInterfaceJ8Iml.printmessage();
		methodsInterfaceJ8Iml.defaultMethodMessage();
		MethodInterface.showMessage();
	}

}
