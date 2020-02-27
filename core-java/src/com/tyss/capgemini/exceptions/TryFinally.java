package com.tyss.capgemini.exceptions;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println( 10 / 0);
			
		} finally {
			System.out.println("Code inside finally block.."); 
		}

	}

}
