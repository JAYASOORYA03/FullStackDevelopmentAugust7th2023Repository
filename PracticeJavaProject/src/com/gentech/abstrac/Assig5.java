package com.gentech.abstrac;
abstract class ML
{
	abstract void md1();
	abstract void md2();
}

abstract class ML1 extends ML
{

	void md1()
	{
		System.out.println("Child class of Super class");
	}
	abstract void md2();
}

class ML2 extends ML1
{
	void md2()
	{
		System.out.println("Sub Class");
	}
}

public class Assig5 {

	public static void main(String[] args) {
		ML2 obj = new ML2();
		obj.md1();
		obj.md2();
	}

}
