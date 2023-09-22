package com.gentech.matrix;

public class Trans3x3Matrix {

	public static void main(String[] args) {
		int x[][] = {{ 2, 4, 6 },{ 3, 6, 9 },{ 4, 8, 12 }};

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x[i].length; j++) {

				System.out.print(x[j][i] + " ");
			}
			System.out.println("");
		}

	}


}



