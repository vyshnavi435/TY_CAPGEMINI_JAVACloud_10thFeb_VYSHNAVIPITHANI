package com.tyss.capgemini.methods;

public class BaicMethods {
/**
 * This method returns the sum of two given integers.
 * @param i
 * @param j
 * @return  i +  j
 */
	public static int add(int i, int j)

	{
		return i + j;
	}
	/**
	 * This method returns the sum of two given integers.
	 * @param i
	 * @param j
	 * @return  i -  j
	 */
	public static int sub(int i, int j) {
		return i - j;
	}
	/**
	 * This method returns the sum of two given integers.
	 * @param i
	 * @param j
	 * @return  i /  j
	 */
	public static double div(int i, int j) {
		return (i / j) * 1.0;
	}

	public static void main(String[] args) {
		int sum = add(12, 13);
		System.out.println("sum: " + sum);
		System.out.println("add: " + add(45, 45));
		System.out.println("sub: " + sub(90, 45));
		System.out.println("div: " + div(15, 2));

	}
}
