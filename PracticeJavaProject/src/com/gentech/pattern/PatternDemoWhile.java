package com.gentech.pattern;

public class PatternDemoWhile {
	public static void main(String[] args) {
		int i=1;{

			while(i<=5) {
				int k=1;
				while(k<=i)
				{
					System.out.print(+k+" ");
					k++;
				}
				i++;
				System.out.println();
			}
		}}}
