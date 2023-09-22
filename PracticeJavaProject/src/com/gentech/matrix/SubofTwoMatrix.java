package com.gentech.matrix;

public class SubofTwoMatrix {

	public static void main(String[] args) {


		int x[][]= {{3,4},{5,6}};
		int y[][]= {{30,40},{50,60}};
		{
			if((x.length==y.length) && (x[0].length==y[0].length))
			{
				for( int i=0;i<x.length;i++)
				{
					for(int j=0;j<x[i].length;j++)
					{
						int res=x[i][j]-y[i][j];
						System.out.print(res+" ");
					}
					System.out.println();
				}
			}
		}


	}

}


