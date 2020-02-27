package com.tyss.capgemini.classesandObjects;



public class ObjectClassExample {
	public static void main(String[] args) 
	{
		ObjectClassExample a1 =new ObjectClassExample();
		ObjectClassExample a2 =new ObjectClassExample();
		System.out.println(a1.getClass());
		System.out.println(a2.hashCode());
		System.out.println("with tostring" +a1.toString());
		System.out.println(a1.equals(a2));
		
		
		
				
	}

}
