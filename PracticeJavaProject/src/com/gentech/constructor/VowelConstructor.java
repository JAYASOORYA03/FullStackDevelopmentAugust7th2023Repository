package com.gentech.constructor;

public class VowelConstructor {

	public static void main(String[] args) {
		vowel vol = new vowel('E');
		vowel vol2 = new vowel('M');

	}

}
class vowel
{
	vowel(char ch)
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			System.out.println("It is Vowel");
		}
		else
		{
			System.out.println("It is not a vowel");
		}
	}
	
}
	
