package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester1 {
	public static void main(String[] args) throws CustomException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number..");
		int number = scanner.nextInt();
		
		scanner.close();
		
		try {
			int i = 10 / number;
		} catch (Exception e) {
			throw new CustomException("Any message");
		}

	}
}
