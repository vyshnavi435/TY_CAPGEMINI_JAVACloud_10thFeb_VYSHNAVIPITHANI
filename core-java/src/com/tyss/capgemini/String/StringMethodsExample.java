package com.tyss.capgemini.String;

public class StringMethodsExample {
	public static void main(String[] args) {
		String string1= "Some String";
		String string2="";
		String  string3="sOmE sTrInG";
		
		int length= string1.length(); // return 
		System.out.println("length of string1: "+string1.length());
		System.out.println("length of string1: "+string2.length());
		System.out.println("empty of string1:"+string1.isEmpty());
		System.out.println("empty of string2:"+string2.isEmpty());
		
		System.out.println("charAt() of string:" + string1.charAt(4));
		System.out.println(string1.charAt(string1.length()-1));
		// the below line will throw exception as string2 is null
		//System.out.println(string1.charAt(123)); //index is always less than length
		//System.out.println(string2.charAt()); // index itself is not present
		
		System.out.println("equals() of string: " + string1.equals(string3));
		System.out.println("equalsignores() of string: " + string1.equalsIgnoreCase(string3));
		System.out.println(string1.concat(" concatenated string")); // u cannot re assign the value
		//return type of concatenated is string it actually print the value of concat method return string
		// prints "some string" as string is immutable
		System.out.println(string1);
		
		String string5= string1.replace('S', 's');
		System.out.println(string1);
		System.out.println("replace() output: " + string5); // prints "some string" as string is immutable
		 
		String string6  = String.valueOf(12345); //covert data to string
		System.out.println(string6);
		System.out.println("toUppercase() of string: "+string1.toUpperCase());
		System.out.println("tolowercase() of string: " +string1.toLowerCase());
		
		System.out.println("substring(int index) of String: "+string1.substring(5));
		System.out.println(string1.substring(5, 9));
		System.out.println("StartWith(string prefix) of String : " + string1.startsWith("A"));
		System.out.println("endsWith() of String : " + string1.startsWith("1"));
		System.out.println(string1); //prints "some string" as string is immutable


		}

}
