package com.gentech.program;

public class Vowels {

	public static void main(String[] args) {
       char ch=args[0].charAt(0);
       if((ch=='a') || (ch=='e') ||(ch=='i') ||(ch=='o') ||(ch=='u') ||(ch=='A') ||(ch=='E') ||(ch=='I') ||(ch=='O') ||(ch=='U'))
       {
    	   System.out.println(ch+ "is the Vowel");
       }
       else 
    	   System.out.println(ch+ "is  a consonant");
       }
	}


