package com.tyss.capgemini.Loops;

import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		for(int i=1; i<=n;i++) {
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
		
		
	}
 
   
	

}
