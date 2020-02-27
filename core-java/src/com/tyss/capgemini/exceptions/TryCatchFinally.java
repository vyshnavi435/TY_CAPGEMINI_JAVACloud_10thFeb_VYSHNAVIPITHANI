package com.tyss.capgemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		 try {
			 System.out.println(10 / 0);
			 
			
		}catch(StringIndexOutOfBoundsException e){
			System.err.println("Exception caught in the code");
			//System.exit(0); // its a line of code doesn't really matter where ever it is written the program will terminated
			
		}
		 
		 catch (Exception e) {
			System.err.println(" caught in code");
			//System.exit(0); //is this the situation finally block will not execute (the code will itself shutdown)
	}
		 finally {
			 System.out.println("Code to be executed be there any exception or not");  // invoke or call needs to be execute
		}
		 System.out.println("some code");
		
	}

}
