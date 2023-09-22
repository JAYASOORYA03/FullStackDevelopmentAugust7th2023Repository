package com.gentech.patternfor;
/*/
1 
4 9 
16 25 36 
49 64 81 100 
 */

public class Sevenfor {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int res=k*k;
				System.out.print(+res+" ");
				k++;
			}
			System.out.println();

		}

	}

}
