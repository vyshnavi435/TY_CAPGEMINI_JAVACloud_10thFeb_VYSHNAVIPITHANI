package com.tyss.capgemini.cfs;

public class IfExample {
	public static void main(String[] args) {
		int age = 17;
		if (age >= 18) 
		{
			System.out.println("Allowed to vote..");
			System.out.println("Another line insid if block..");
		}
		System.out.println("Code outside the if block..");
     
	}
}
// when we have two more statements to be executed the curly braces should be used