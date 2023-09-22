package com.gentech.abstrac;

abstract class MLOver
{
	MLOver(String Managername) 
	{
		System.out.println("The Managername in super class is : "+Managername);
	}
	MLOver(int expyear)
	{
		System.out.println("The Year of Experience in super class is : "+expyear);
	}
}

class MLOver1 extends MLOver
{
	MLOver1(String Managername) {
		super(Managername);
	}
	MLOver1(int expyear)
	{
		super(expyear);
	}
	void method1()
	{
		System.out.println("Child class");
	}
  }

class MLOver2 extends MLOver1
{
	MLOver2(String Managername){
		super(Managername);
	}

	MLOver2(int expyear){
		super(expyear);
	}
}

public class Assig8 {

	public static void main(String[] args) {
		MLOver2 j = new MLOver2("jayasoorya");
		MLOver2 j2 = new MLOver2(24);
	}

}
