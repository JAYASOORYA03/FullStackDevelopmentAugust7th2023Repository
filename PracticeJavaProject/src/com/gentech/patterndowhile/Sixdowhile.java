package com.gentech.patterndowhile;
/*/
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
 */
public class Sixdowhile {

	public static void main(String[] args) {
		int num=5;
		int i=1;

		do {
			int k=1;
			do {
				System.out.print(num+" ");
				k++;
				num=num+5;
			}while(k<=i);


			System.out.println();
			i++;
		}while(i<=5);
	}

}

