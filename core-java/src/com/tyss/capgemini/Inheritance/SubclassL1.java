package com.tyss.capgemini.Inheritance;

public class SubclassL1  extends Superclass {
	@Override
	public String print()
	{
		return "Some other String";    // i can have own methods in my class
	}
	public void display()
	{
		System.out.println("display() of subclass");
	}
	public static void main(String[] args) {
		Superclass superclass = new SubclassL1();
				SubclassL1 subclassL1 = new SubclassL1();
				
				//Superclass superclass2 = new SubclassL1();	//up casting
				//SubclassL1 subclassL12= (SubclassL1)superclass2; //downcasting
		System.out.println(superclass.print());
		System.out.println(subclassL1.print());
		//System.out.println(subclassL12.print());
		subclassL1.display();
		
	}
}
