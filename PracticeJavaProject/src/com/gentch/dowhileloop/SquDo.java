package com.gentch.dowhileloop;

public class SquDo {

	public static void main(String[] args) {
		int sqre=0;
		int i=20;
		do
		{
			sqre=sqre+(i*i);
			i--;
		}while(i>=1);
		System.out.println(sqre);


	}


}


