package com.tyss.capgemini.Loops;

import java.util.Scanner;

public class Ass1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n = scanner.nextInt();
		if (n % 2 == 0) {
			for (int i = 0; i <= n; i++) {
				System.out.println("The number is even");
			}
		} else {
			System.out.println("The number is odd");
		}

		scanner.close();
	}
}
