package com.gentech.patternwhile;
/*/
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
public class Eightwhile {

	public static void main(String[] args) {
		int num=15;
		 int i=5;
		 while(i>=1)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num+" ");
				k++;
				num--;
			}
			System.out.println();
			i--;
		}

	}

}

	
