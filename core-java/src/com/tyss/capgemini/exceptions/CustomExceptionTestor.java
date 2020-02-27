package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTestor {
	public static void main(String[] args) throws CustomException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number..");

		int number = scanner.nextInt();
		scanner.close();

		if (number >= 0 && number <= 10) {
			System.out.println(number * 10);

		} else
			throw new CustomException("Custom Exception message");
	// compiler didn't told compiler didnt
	}

}
