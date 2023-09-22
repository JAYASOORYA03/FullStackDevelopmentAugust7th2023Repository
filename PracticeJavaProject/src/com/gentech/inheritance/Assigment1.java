package com.gentech.inheritance;
class district
{
	void distname(String Districtname)
	{
		System.out.println("District name:"+Districtname);
	}
}
class district1 extends district
{
	district1(String name)
	{
		super.distname(name);
	}
	
	void distname(String Districtname)
	{
		System.out.println("District name in sub class:"+Districtname);
	}
}
class District2 extends district1
{
	District2(String address)
	{
		super(address);
		super.distname(address);	
		
	}
	void distname(String Area)
	{
		System.out.println("near by address:"+Area);
	}
}
public class Assigment1 {

	public static void main(String[] args) {
		District2 o=new District2("chennai");
		o.distname("Bangalore");
	}

}
