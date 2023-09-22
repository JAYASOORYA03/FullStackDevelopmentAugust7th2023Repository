package com.gentech.abstrac;

abstract class AbS
{
	static 
	{
		System.out.println("Static Block");
	}
}
class abs1 extends AbS
{
	
}
public class Assig2 {

	public static void main(String[] args) {
     abs1 o= new abs1();
	}

}
