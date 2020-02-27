package com.tyss.capgemini.Loops;

public class Hcf {
	public static void main(String[] args) 
	{
		int j=5;
		int k=6;
		int hcf=0;
		for(int i=1; i<=j|| i<=k; i++)
		{
			if((j%i==0) && (k%i==0))
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
	}
	

}
