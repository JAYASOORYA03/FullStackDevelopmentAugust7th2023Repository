package com.gentech.methods;

public class Methods {

	public static void main(String[] args) {
		byte b[] = {6,5,4,3,2,1};
		short s[] =  {1,2,3,4,5,6};
		int i[] = {8,7,6,5,4,3,2,1};
		char ch[] = {'a','e','z','t','j'};
		String st[] = {"cse","mec","eee"};
		int x[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int y[][] = {{11,22,33},{44,55,66},{77,88,99}};
		String str[][] = {{"lol","cob","mob"},{"zyx","xyz","yzx"},{"jdk","idk","mlm"}};
		assignments obj = new assignments();

		obj.bytearray(b);
		obj.shortarray(s);
		obj.intarray(i);
		obj.chararray(ch);
		obj.stringarray(st);
		obj.onedarraysum(i);
		obj.charvowel(ch);
		obj.int2darray(x);
		obj.int2dsumarray(y);
		obj.subtract(x, y);
		obj.squarearray(i);
		obj.concatstring(str);

	}

}
class assignments
{
	// byte array read second half element
	void bytearray(byte[] a)
	{
		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	// one d array read first half of element
	void shortarray(short s[])
	{
		for(int i=s.length/2;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	// one d integer array read the first half of element
	void intarray(int a[])
	{
		for(int i=a.length/2-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	// one d char array
	void chararray(char ch[])
	{
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			s = s + ch[i];
		}
		System.out.println("concatinated chars : ");
			System.out.println(s);
	}
	

	//one d string array create the element
	void stringarray(String s[])
	{
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+",");
		}
		System.out.println();
		System.out.println();
	}
	
	//one d integer array find sum of all element
	void onedarraysum(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}

	//one d char array display vowel seperate
	void charvowel(char c[])
	{
		for(int i=0;i<c.length;i++)
		{
			char ch = c[i];
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
				System.out.print(ch+", ");
			}
		}
		System.out.println();
		System.out.println();
	}

	//2 d 3x3 integer array read last row
	void int2darray(int x[][])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[2][i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	//2d 3x3 integer array find the sum of element of first row
	void int2dsumarray(int a[][])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[0][i];
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}
	
	//sum of two matrix in reverse order
	void subtract(int a[][],int b[][])
	{
		int res[][] = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[0].length;j++)
			{
				res[i][j] = a[i][j] - b[i][j];
			}
		}

		for(int i = a.length-1;i>=0;i--)
		{
			for(int j = a[0].length-1;j>=0;j--)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	//one d integer array square of each element
	void squarearray(int x[])
	{
		System.out.println();
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			sum = sum + (x[i]*x[i]);
		}
		System.out.print("sum : " + sum);
		System.out.println();
		System.out.println();
	}

	//two d string array concadinate all element
	void concatstring(String str[][])
	{
		String s=" ";
		System.out.println( );
		for(int i = 0;i<str.length;i++)
		{
			for(int j = 0;j<str[0].length;j++)
			{
				s=s+str[i][j];
			}
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
	}}

