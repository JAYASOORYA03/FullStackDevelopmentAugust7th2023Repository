package com.gentech.array;

public class Bytearray {

	public static void main(String[] args) {
		byte ch[] = {18, 07, 99, 10};
		int i = ch.length - 1;

		do {
		    System.out.println(ch[i]);
		    i--;
		} while (i >= 0);
}}