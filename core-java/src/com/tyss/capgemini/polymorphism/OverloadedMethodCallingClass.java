package com.tyss.capgemini.polymorphism;

public class OverloadedMethodCallingClass {
	public static void main(String[] args) {
		
		OverloadedMethodClass overloadedmethodsclass = new OverloadedMethodClass();
		System.out.println("add(int i, int j):"+ overloadedmethodsclass.add(5,6));
		System.out.println("add(int i, int j,int k):"+ overloadedmethodsclass.add(4,5,6));
		System.out.println("add(int i, double d):"+ overloadedmethodsclass.add(6,34.89));
		System.out.println("add(double d, int i):"+ overloadedmethodsclass.add(3.5,6));
		
	}

}
