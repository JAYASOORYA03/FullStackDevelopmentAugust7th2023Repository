package com.gentch.dowhileloop;

public class SumOddDo {

	public static void main(String[] args) {
		int sum=0;
		int i=50;
		do {
			if(i%2==1)
			{
				sum=sum+i;
			}
			i++;
			
	
		}while(i<=100);
		System.out.println(sum+ "Sum of Odd Number Between 50 to 100");

	}

}
