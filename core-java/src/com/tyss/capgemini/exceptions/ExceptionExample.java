package com.tyss.capgemini.exceptions;

public class ExceptionExample {
	public static void main(String[] args) {
		String string = "";

		try {
			System.out.println(string.charAt(3));
			int i = 10 / 0;
			
			System.out.println(i);
		}
		//  catch (c e) {
		// System.err.println("charAt(int index) should not be called on null strings");
		// System.out.println(e.getClass());
		// System.out.println(e.getCause());
		// System.err.println(e.getMessage());
		// } catch (ArithmeticException e) {
		// System.err.println("shou");
		// System.out.println(e.getClass());
		// System.out.println(e.getCause());
		// System.out.println(e.getMessage());
		catch (Exception e) {
			System.out.println("Exception caught in the code");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());

		}

	}

}
