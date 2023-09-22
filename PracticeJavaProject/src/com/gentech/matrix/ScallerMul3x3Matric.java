package com.gentech.matrix;

public class ScallerMul3x3Matric {

	public static void main(String[] args) {
		double x[][] = { { 4, 5, 6 }, { 9, 8, 5 } };
		{
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					System.out.print(x[i][j] * 2 + " ");
				}
				System.out.println(" ");
			}
		}

	}

}

	
