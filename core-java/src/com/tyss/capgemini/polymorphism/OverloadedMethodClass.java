package com.tyss.capgemini.polymorphism;

public class OverloadedMethodClass {
	public int add(int i, int j) {       
		return i + j;
	}

	public int add(int i, int j, int k) {  // second method is diffnt from first method is differ from order or sequence
		return i + j + k;
	}

	public double add(int i, double d) {
		return i + d;
	}

	public double add(double d, int i) {
		return d + i;
	}

}
