package com.tyss.capgemini.collections;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intArray = new int[6];
		intArray1= {10,20,30,40,50};
		
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		intArray[4]=5;
		intArray[5]=6;
		
		for(int i=0; i < intArray1.length; i++) {
			System.out.println("Element at intArray1 index: " + i + "="+intArray1[i]);
		}
		
		 
			
		} 
	// the below lines of code will throw an exception ArrayIndexoutofBonusEception
	{
			System.out.println("Element at intArray1 index: " + i + "="+intArray1[i]);
		}
		
	}

}
