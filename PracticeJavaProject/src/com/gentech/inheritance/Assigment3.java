package com.gentech.inheritance;
class earth
{
	String name;
	void planetname(String planetname)
	{
		System.out.println("the planet name in parent class:"+planetname);
	}
}
class earth1 extends earth
{
	earth1(String glaxyname)
	{
		super.name=glaxyname;
		super.planetname(glaxyname);
	}
	String name;
	void planetname(String platname)
	{
		System.out.println("the planet name in child class:"+platname);
	}
}
class earth2 extends earth1
{
	earth2(String solarsystemname)
	{
		super(solarsystemname);
		super.planetname(solarsystemname);	

	}
	String name;
	void planetname(String solarname)
	{
		System.out.println("the planet name in child class:"+solarname);
	}
}

public class Assigment3 {

	public static void main(String[] args) {
		earth2 obj=new earth2("Mercury");
		obj.planetname("Mars");

	}

}

