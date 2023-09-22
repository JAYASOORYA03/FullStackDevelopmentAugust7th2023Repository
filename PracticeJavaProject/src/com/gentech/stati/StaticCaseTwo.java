package com.gentech.stati;
class star
{
	static String Name;
	static void add(int x,int y) {
		int res=(x+y);
		 System.out.println("Add res:"+res);
	}
	static void sub(int x, int y)
	{
		
		int res2=(x-y);
		System.out.println("Add res:"+res2);
	}
	
}
public class StaticCaseTwo {

	public static void main(String[] args) {
       star.Name="suriya";
       System.out.println("Name:"+ star.Name);
       star.add(20, 40);
      
       star.sub(60, 20);
	}

}
