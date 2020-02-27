package com.tyss.capgemini.Inheritance;

public class SubclassL2 extends SubclassL1 {
@Override
public void display() {

	super.display();  
	super.i=12; // super should write with the method it should not write within the class
	System.out.println("Overriden display() in subclass2");
}
@Override
	public String print() {
	System.out.println("Overriden print() in subclass2");
		return super.print();
	}                                      
public static void main(String[] args) {
	SubclassL2 subclassL2 = new SubclassL2();
	subclassL2.display();                            // int j=super.i; super content cannot be static 
	System.out.println(subclassL2.print());
	System.out.println("int i of Superclass:" + subclassL2.i);
	
}
}
