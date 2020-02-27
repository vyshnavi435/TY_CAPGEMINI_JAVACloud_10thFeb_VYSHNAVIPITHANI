package com.tyss.capegemini.primitivedatatypes;

public class TernaryOperator {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int res = (i > j) ? (i + j) : (i - j);
		System.out.println(res);
		
		int res1 = (i < j) ? (i + j) : (i - j);
		System.out.println(res1);
	}

}
