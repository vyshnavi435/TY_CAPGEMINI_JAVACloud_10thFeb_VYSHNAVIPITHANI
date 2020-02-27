package com.tyss.capegemini.primitivedatatypes;

public class logicaloperator {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 30;
		System.out.println((i > j) && (j < k));
		System.out.println((i > j) && (j < k)); // AND OPERATOR
		System.out.println((i < j) && (j > k));
		System.out.println((i < j) && (j < k));
		System.out.println("***oR***");
		System.out.println((i > j) || (j < k));
		System.out.println((i > j) || (j < k));
		System.out.println((i < j) || (j > k)); // OR OPERATOR
		System.out.println((i < j) || (j < k));
		System.out.println("***Not***");

		System.out.println(i != j);
		System.out.println(j != k); // not operator

	}

}
