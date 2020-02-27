package com.tyss.capgemini.String;

public class StringBufferExample {
	public static void main(String[] args) 
	{
		String string = "Some String"; //Inheritor to convert the string into string buffer
		String str = "MALYALAM";
		StringBuffer stringBuffer =new StringBuffer("string") ;
		System.out.println(stringBuffer.getClass());
		System.out.println(stringBuffer.length());
		
		stringBuffer.append("Buffer"); //in this append we can given any string value * append we know just using functionality we 
		System.out.println(stringBuffer);// Don't know the logic behind this is called abstraction
		
		System.out.println(stringBuffer.reverse()); // replace things in different manner
		System.out.println(stringBuffer.reverse());
		
		stringBuffer.replace(0, 1, "S");
		System.out.println(stringBuffer);
		
		stringBuffer.insert(5, "ABC");
		System.out.println(stringBuffer);
		
		int index = stringBuffer.indexOf("AB");
		System.out.println(index);
		
		stringBuffer.delete(5, 8);
		System.out.println(stringBuffer);
		
		
		
		
				
		
		
	}

}
