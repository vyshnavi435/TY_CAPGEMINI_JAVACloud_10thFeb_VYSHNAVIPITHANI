package com.tyss.capgemini.Loops;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) * 13);
		}
		System.out.println("***for loop-2*****");
		int j = 0;
		for (; j < 10; j++) {
			System.out.println((j + 1) * 12);
		}
		System.out.println("***for loop-3*********");
		int k = 0;
		for (; k < 10;) {
			System.out.println((k + 1) * 14);
			k++;
		}
	}

}
