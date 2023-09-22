package com.gentech.whileloop;

public class SumOddWhile {

	public static void main(String[] args) {
		int i=50;
		int sum=0;
		while (i<=100) 
		{
			if (i%2==1) {
				sum=sum+i;

			}i++;

		}	
		System.out.println(sum+ "sum of Odd Number Between 50 to 100");


	}
}




