package com.tyss.capgemini.methods;

public class VaragsInputExample {
	public int add(int ...input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {          //oracle ques we can use varags also
			sum += input[i];
		//	sum = sum + input[i]             // it is fixed
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Sum: " +new VaragsInputExample().add(1,2,456,78,98));
	}

}
