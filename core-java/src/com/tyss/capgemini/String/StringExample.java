package com.tyss.capgemini.String;

public class StringExample {
	public static void main(String[] args) {     //javalang is alreading imported//
		String string1 = "Some String";
		
	     String   string2 = new String(" Some Other String");
		
		String string3 = "Some Other String";
		
		String string4 = "Some String";
		
		String string5= new String("Some Other String");
		
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		System.out.println(string3.hashCode()); //what is present inside the address
		System.out.println(string4.hashCode());
		System.out.println(string5.hashCode());
		
		System.out.println("string1 == string4: " + string1.equals(string4)); 
		
		System.out.println("string2 == string3: " + string2.equals(string3)); 
		
		System.out.println("string2 == string5: " + string2.equals(string5)); 
		
	}

}
