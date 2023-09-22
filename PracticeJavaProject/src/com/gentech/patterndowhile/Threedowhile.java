package com.gentech.patterndowhile;
/*/
12345
1234
123
12
1
 */
public class Threedowhile {

	public static void main(String[] args) {
		int i=5; 
		do {
			int k=1; 
			do{
				System.out.print(k);
				k++;
			}while(k<=i);

			System.out.println();
			i--;
		}while (i>=1);

	}

}


