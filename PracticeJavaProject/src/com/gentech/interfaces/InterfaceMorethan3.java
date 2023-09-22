package com.gentech.interfaces;

interface mod
{
	public static final int J = 350;
	public static final int S = 200;
	public static final int E = 100;
	void mod1();
}

class Modulus implements mod
{
	public void mod1()
	{
		System.out.println("MODULUS : "+J%S%E);
	}
}

public class InterfaceMorethan3 {

	public static void main(String[] args) {

		Modulus m = new Modulus();
		m.mod1();
	}
}

