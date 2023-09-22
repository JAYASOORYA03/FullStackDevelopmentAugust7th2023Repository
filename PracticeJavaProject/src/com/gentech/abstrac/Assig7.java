package com.gentech.abstrac;
abstract class MLPara
{
	MLPara(String Empname) 
	{
		System.out.println( "Employeename in super class is : "+Empname);
	}
}

class MLPara1 extends MLPara
{
	MLPara1(String Empname) {
		super(Empname);
	}
	void method1()
	{
		System.out.println("Child class of Super class");
	}
  }

class MLPara2 extends MLPara1
{
	MLPara2(String Empname){
		super(Empname);
	}
}

public class Assig7 {

	public static void main(String[] args) {

		MLPara2 j = new MLPara2("jayasoorya");
		j.method1();
	}

}
