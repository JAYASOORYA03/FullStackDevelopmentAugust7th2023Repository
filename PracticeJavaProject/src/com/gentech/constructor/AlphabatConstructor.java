package com.gentech.constructor;

public class AlphabatConstructor {

	public static void main(String[] args) {
		alphabet alp = new alphabet('%');
		alphabet alp2 = new alphabet('J');
	}

}

class alphabet
{
	alphabet(char ch)
	{
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			System.out.println("It is Alphabet");
		}
		else
		{
			System.out.println("It is not a Alphabet");
		}
	}
	alphabet()
	{
		
	}
	
	}


