package com.gentech.interfaces;
interface planetname
{
	void showpla(String s);
}
interface planetno
{
	void showplanum(int n);
}
interface glaxyname
{
	void showglax(String s);
}
interface pladetails extends planetname,planetno,glaxyname
{
	void showslo(String n);
}

class solarsystem implements pladetails
{
	public void showpla(String s) 
	{
		System.out.println("Planet : "+s);
	}
	public void showplanum(int n)
	{
		System.out.println("Planet Number : "+n);
	}
	public void showglax(String s)
	{
		System.out.println("Glaxy : "+s);
	}

	public void showslo(String n)
	{
		System.out.println("system : "+n);
	}
}
public class MultipleinheritenceMorethan3 {

	public static void main(String[] args) {

		solarsystem p = new solarsystem();
		p.showpla("EARTH");
		p.showglax("MILKYWAY");
		p.showslo("SolarSystem");
		p.showplanum(3);
	}
}

