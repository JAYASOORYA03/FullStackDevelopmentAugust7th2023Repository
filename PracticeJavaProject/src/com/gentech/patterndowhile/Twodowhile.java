package com.gentech.patterndowhile;
/*/
5  5  5  5  5 
5  5  5  5 
5  5  5 
5  5 
5 

*/
public class Twodowhile {
	public static void main(String[] args) {
		int i=5; 
		do {
			int k=1; 
			do{
				System.out.print("5 ");
				k++;
			}while (k<=i);			
			System.out.println();
			i--;
		}while (i>=1);

	}

}





