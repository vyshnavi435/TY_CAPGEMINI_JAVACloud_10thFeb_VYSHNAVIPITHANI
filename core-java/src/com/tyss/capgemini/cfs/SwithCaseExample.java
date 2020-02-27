package com.tyss.capgemini.cfs;

public class SwithCaseExample 
{
public static void main(String[] args) 
{
	String day="Monday";
	switch (day)
	{
	case "Monday":
		System.out.println("Weekday");
		
	case "Tuesday":
		System.out.println("Weekday");
		break;
		
	case "Wednesday":
		System.out.println("Weekday");
		break;
	case "Thursday":
		System.out.println("Weekday");
		break;
	case "Friday":
		System.out.println("Weekday");
		break;
		

	default:
		System.out.println("Invalid day");
		break;
	}
}
}
