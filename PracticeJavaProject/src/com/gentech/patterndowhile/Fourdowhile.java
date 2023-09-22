package com.gentech.patterndowhile;
/*/
1
22
333
4444
55555
 */
public class Fourdowhile {

	public static void main(String[] args) {
		int i=1; 
		do {
			int k=1; 
			do{
				System.out.print(i);
				k++;
			}while(k<=i);

			System.out.println(); 
			i++;
		}while (i<=5);
	}
}





