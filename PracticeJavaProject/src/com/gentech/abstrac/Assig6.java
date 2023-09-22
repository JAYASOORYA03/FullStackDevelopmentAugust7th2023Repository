package com.gentech.abstrac;

abstract class Hybl
{
	abstract void md1();
	abstract void md2();
}

abstract class Hybl1 extends Hybl
{

	void md1()
	{
		System.out.println("Child class of Super class");
	}
	abstract void md2();
}

class Hybl12 extends Hybl1
{
	void md2()
	{
		System.out.println("From Sub Class");
	}
}

class Hybl13 extends Hybl
{


	void md1()
	{
		System.out.println("Simple Inheritance of Super class");
	}
	void md2()
	{
		System.out.println("Simple Inheritance of Super class");
	}
}

public class Assig6 {

	public static void main(String[] args) {
		Hybl12 obj = new Hybl12();
		obj.md1();
		obj.md2();
		System.out.println();
		
		Hybl13 obj2 = new Hybl13();
		obj2.md1();
		obj2.md2();
	}

}
