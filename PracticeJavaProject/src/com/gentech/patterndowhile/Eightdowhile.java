package com.gentech.patterndowhile;
/*/
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
public class Eightdowhile {

	public static void main(String[] args) {
		int num=15;
		int i=5;

		do{
			int k=1;

			do {
				System.out.print(num+" ");
				k++;
				num--;
			}while(k<=i);

			System.out.println();
			i--;
		}while(i>=1);


	}

}




