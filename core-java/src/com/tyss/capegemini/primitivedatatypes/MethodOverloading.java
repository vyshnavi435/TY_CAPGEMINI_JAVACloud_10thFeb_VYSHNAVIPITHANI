package com.tyss.capegemini.primitivedatatypes;

public class MethodOverloading {
	public static void displayMessage() {
		
		System.out.println("public static void displaymessage");
		
	}
	
		public static void displayMessage(String string) {
			
			System.out.println("public static void displaymessage(String  STRING)");
			
		}
       public  void displayMessage(String string, int i) {
			
			System.out.println("public static void displaymessage(String  STRING , int i)");
			
		}
       //overloaded methods
       public  void displayMessage( int i, String string) {
			
			System.out.println("public static void displaymessage(int i, String  STRING)");
			
		}
       
       public static void main(String[] args)
       {
    	   MethodOverloading method= new MethodOverloading();
    	   MethodOverloading.displayMessage();
    	   displayMessage("Any string");
    	   method.displayMessage("Any string", 1234);
    	   method.displayMessage(1234, "Any string");
    	   method.hashCode();
    	   

    	   
       }
		
	}


