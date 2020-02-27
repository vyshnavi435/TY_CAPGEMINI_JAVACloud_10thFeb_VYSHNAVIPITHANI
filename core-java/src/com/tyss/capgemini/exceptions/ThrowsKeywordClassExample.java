package com.tyss.capgemini.exceptions;


import java.util.FileReader;


public class ThrowsKeywordClassExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader("application.properties"));
		System.out.println(properties.getProperty("name")); 
		System.out.println("some code..");
		
		
	}
	

}
