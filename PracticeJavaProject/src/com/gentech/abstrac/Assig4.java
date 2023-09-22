package com.gentech.abstrac;

class AbStat2
{
	static void md1()
	{
		System.out.println("Static Block 1");
	}
	static void md2()
	{
		System.out.println("Static Block 2");
	}
}
public class Assig4 {

	public static void main(String[] args) {
		AbStat2.md1();
		AbStat2.md2();
	}

}
