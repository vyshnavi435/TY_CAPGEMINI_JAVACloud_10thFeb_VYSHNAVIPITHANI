package com.tyss.capgemini.cfs;

public class ElseIfLadder {
	public static void main(String[] args) 
	{
		int number=10;
		if(number < 13)
			System.out.println("Not a teen number(Number below 13)");
		else if(number >=13 && number <=19)
			System.out.println("Teen Number");
		else
		{
			System.out.println("Not a teen Number(Number above 19)");
			
			
		}
	}

}
