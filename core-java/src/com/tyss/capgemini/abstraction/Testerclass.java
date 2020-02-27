package com.tyss.capgemini.abstraction;

public class Testerclass extends AbstractClassExample  {
	@Override
	String display() {
		
		return "display() of AbstractClassExample";
	}
	@Override
	String print() {
		
		return "print() of AbstractClassExample";
	}
	@Override
	public void displaymessage() {
		
		System.out.println("display message of MethodInterface in AbstarctclassExample");
	}
	@Override
	public void printmessage() {
		System.out.println("print message of methodInterface");
		
	}
	
	public static void main(String[] args) {
		Testerclass testerclass = new Testerclass();
		testerclass.displaymessage();
		testerclass.printmessage();
		System.out.println(testerclass.print());
		System.out.println(testerclass.display());
		
		
		
	}

}
