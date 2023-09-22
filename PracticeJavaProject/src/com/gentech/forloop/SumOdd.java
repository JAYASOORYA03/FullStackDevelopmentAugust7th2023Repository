package com.gentech.forloop;

public class SumOdd {

	public static void main(String[] args) {
		int num=0;
		for(int i=50;i<=100;i++)
		{
			if(i%2==1) 
			{
				num=num+i;
			}
		}
		System.out.println(num);
		}}
