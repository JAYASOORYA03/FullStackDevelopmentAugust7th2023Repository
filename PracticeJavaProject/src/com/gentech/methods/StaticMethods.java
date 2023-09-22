package com.gentech.methods;
class method
{
	//Display odd numbers between 20 to 40
	static int a=20;
	static void shownumbers()
	{
		if(a<=40)
		{
			if(a%2==1)
			{
				System.out.println(a);
			}
			a++;
			shownumbers();
		}
	}

	//Display Even number between 20 to 1

	static int b=20;
	static void shownumber()
	{
		if(b>=1)
		{
			if(b%2==0)
			{
				System.out.println(b);
			}
			b--;
			shownumber();
		}
	}

	//Display number divisible by 8
	static int c=1;
	static void shownumberdivisibleby8()
	{
		if(c<=100)
		{
			if(c%8==0)
			{
				System.out.println(c);
			}
			c++;
			shownumberdivisibleby8();
		}
	}

	//Display count of numbers divisible by 10
	static int count=100;
	static void showcountdivisibleby10()
	{
		if(count<=200)
		{
			if(count%10==0)
			{
				System.out.println(count);

			
			count=count+1;
			showcountdivisibleby10();
			}
	}
}

	//sum of first 20numbers
	static int d=1, sum=0;
	static void showsumoffirst20numbers()
	{
		if(d<=20) 
		{
			sum=sum+d;
		
			d++;
		}
			System.out.println(sum);
		
		

		showsumoffirst20numbers();
	}
		

	
	// Display Tenth Table
	static int e=1;
	static void showtentable()
	{
		if(e<=10)
		{
			System.out.println("10*"+e+"="+e*10);

			e++;
			showtentable();
		}
	}
	//Display fiveTable in reverse
	static int f=10;
	static void showfivetable()
	{
		if(f>=1)
		{
			System.out.println("5*"+f+"="+f*5);
			f--;
			showfivetable();

		}
	}


}

public class StaticMethods {

	public static void main(String[] args) {
		method.shownumbers();
		System.out.println("++++++++++++++++++++++++++++++++++");
		method.shownumber();
		System.out.println("++++++++++++++++++++++++++++++++++");
		method.shownumberdivisibleby8();
		System.out.println("++++++++++++++++++++++++++++++++++");
		method.showcountdivisibleby10();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		method.showtentable();
		System.out.println("++++++++++++++++++++++++++++++++++");
		method.showfivetable();
	}

}


	
