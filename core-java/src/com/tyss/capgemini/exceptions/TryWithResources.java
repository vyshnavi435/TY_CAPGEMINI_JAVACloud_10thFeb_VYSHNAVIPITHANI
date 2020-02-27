package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int i = 10;
			int j = scanner.nextInt();
			if (j == 0)
			{
				System.err.println("should not dived by zero");
			}
			else
			{
				System.out.println(i / j);
			}

			// int i = 10;
			// int j = scanner.nextInt();
			// System.out.println(i / j);
			// } catch (Exception e) {
			// System.out.println("should not divide the number by zero..");
			// System.out.println(e.getMessage());

		}

	}

}
