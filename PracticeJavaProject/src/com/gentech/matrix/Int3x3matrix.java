package com.gentech.matrix;

public class Int3x3matrix {

	public static void main(String[] args) {
		int a[][] = {{ 1,3,5 },{ 8,7,6 },{ 9,3,2 }};

		int b[] = new int[3*3];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[k] = a[i][j];
				k++;
			}
			}
			for(int z=0;z<b.length;z++)
			{
				System.out.print(b[z]+" ");
			}
		
	}

}

