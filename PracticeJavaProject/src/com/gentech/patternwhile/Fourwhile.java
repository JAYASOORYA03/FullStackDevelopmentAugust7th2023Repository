package com.gentech.patternwhile;
/*/
1
22
333
4444
55555
 */
public class Fourwhile {

	public static void main(String[] args) {
		int i=1; 
		while (i<=5) {
			int k=1; 
			while(k<=i)  {
				System.out.print(i);
				k++;
			}
			System.out.println(); 
			i++;
		}
	}
}


