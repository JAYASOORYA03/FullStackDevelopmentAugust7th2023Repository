package com.gentech.patternwhile;
/*/
1 
4 9 
16 25 36 
49 64 81 100 
 */
public class Sevenwhile {
	public static void main(String[] args) {
		int k=1;
		int i=1;
		while(i<=4)
		{
			int j=1;
			while(j<=i)
			{
				int res=k*k;
				System.out.print(+res+" ");
				j++;
				k++;
			}
			System.out.println();
			i++;

		}

	}


}
