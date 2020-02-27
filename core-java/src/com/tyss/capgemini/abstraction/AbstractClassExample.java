package com.tyss.capgemini.abstraction;

import com.tyss.capgemini.Inheritance.MethodInterface;

public abstract class AbstractClassExample implements  MethodInterface { 
	abstract String display();    //if a abstract class wriiten with a method then it is mandatory to have abstarct class
	abstract String print();
	@Override
	public void displaymessage() {
		System.out.println("displaymessage of Methodinterface ");
		
	}
	
	
	// if a class having abstractmethod it is mandatory to have abstract class
	                                 //  we haveto implement the method somwwhere
	//in jav8 we have either defualt or static methods 

}
