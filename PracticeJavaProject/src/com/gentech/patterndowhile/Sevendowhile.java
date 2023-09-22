package com.gentech.patterndowhile;
/*/
1 
4 9 
16 25 36 
49 64 81 100 
 */
public class Sevendowhile {

	public static void main(String[] args) {
		int k=1;
		int i=1;

		do{
			int j=1;
			do {
				int res=k*k;
				System.out.print(+res+" ");
				j++;
				k++;
			}while(j<=i);

			System.out.println();
			i++;
		}while(i<=4);

	}

}
