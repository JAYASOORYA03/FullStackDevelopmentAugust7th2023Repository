package com.gentech.pattern;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		do {
			int k=1;
			do
			{
				System.out.print(+k+" ");
				k++;
			}while(k<=i);
			i++;
			System.out.println();
		}while(i<=5);
	}

}
