package com.tyss.capgemini.methods;

public class MethodOverringclass extends Methods {

	@Override
	public String printMessage() {
		return "non-static MethodOverringClass.printMessage()";
	}

	// @Override//
	public static String displayMessage() {
		return "Static MethodOverringClass.displayMessage()"; // static methods cannot be overridden it is loaded only
																// once
		// otherwise it creates ambiguity
	}

	@Override
	protected String welcomeMessage() {

		return super.welcomeMessage();
	}

	@Override
	int addingTwoIntegers(int i, int j) {

		return super.addingTwoIntegers(i, j);
	}

	public static void main(String[] args) {
		MethodOverringclass m = new MethodOverringclass();
		System.out.println(m.printMessage());
		System.out.println(m.displayMessage());
		System.out.println(m.welcomeMessage());

		System.out.println(m.addingTwoIntegers(2, 3));

		System.out.println(Methods.displayMessage());
		System.out.println(displayMessage());

	}
}
// protected used outside of class only when it is extented