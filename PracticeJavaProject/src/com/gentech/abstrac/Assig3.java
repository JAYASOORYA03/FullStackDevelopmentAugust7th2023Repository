package com.gentech.abstrac;

abstract class AbNoArgs
{
	AbNoArgs()
	{
		System.out.println("No Arg Constructor Block");
	}
}
class AbNoArgs1 extends AbNoArgs
{
	
}
public class Assig3 {

	public static void main(String[] args) {
		AbNoArgs1 j = new AbNoArgs1();
	}

}
