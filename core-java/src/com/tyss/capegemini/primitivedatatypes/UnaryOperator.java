package com.tyss.capegemini.primitivedatatypes;

public class UnaryOperator {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		boolean isTrue = true;
		System.out.println(-i);
		System.out.println(!isTrue);
		System.out.println("The value of i with pre-incre:" + ++i);// pre incre
		System.out.println("value of i: " + i);

		System.out.println("The value of i with post-incre:" + j++);// post incre
		System.out.println("value of j: " + j);
		
		System.out.println("value of i with pre-decrement:" + --i);// pre decre
		System.out.println("value of j: " + i);
		
		System.out.println("value of i with post-decrement:" + j--);// pre decre
		System.out.println("value of j: " + j);
		
		
	}

}
