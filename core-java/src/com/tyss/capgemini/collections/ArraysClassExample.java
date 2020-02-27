package com.tyss.capgemini.collections;

import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {
		int[] intArray = { 34, 456, 21, 45, 98, 345, 0, 476 };
		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		int[] intArray2 = Arrays.copyOf(intArray, 10);
		System.out.println("length of array" + intArray2.length);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		System.out.println("*****************************************");

		Arrays.fill(intArray2, 8, 10, 190);
		Arrays.fill(intArray2, 9, 10,(int) 130);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		System.out.println("*********************************");
		
		System.out.println(intArray.equals(intArray2));
		
		System.out.println(Arrays.equals(intArray, intArray2)); // overloaded methods present in same class

	}

}
