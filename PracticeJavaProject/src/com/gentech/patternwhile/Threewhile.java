package com.gentech.patternwhile;
/*/
12345
1234
123
12
1
 */
public class Threewhile {

	public static void main(String[] args) {
		 int i=5; 
		 while (i>=1)  {
	            int k=1; 
	            while(k<=i) {
	                System.out.print(k);
	                k++;
	            }  
	            System.out.println();
	            i--;
	        }
	    }
	}
