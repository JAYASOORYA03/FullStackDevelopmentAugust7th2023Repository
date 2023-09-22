package com.gentech.patternwhile;
/*/
5  5  5  5  5 
5  5  5  5 
5  5  5 
5  5 
5 

*/
public class Twowhile {

	public static void main(String[] args) {
		int i=5; 
		while (i>=1) {
			int k=1; 
			while(k<=i)  {
				System.out.print("5 ");
				k++;
			}
			i--;
			System.out.println();

		}

	}


}
