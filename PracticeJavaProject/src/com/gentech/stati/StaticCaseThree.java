package com.gentech.stati;
class demo1{
	void add(int x, int y) {
		int res=(x+y);
		System.out.println("add:"+res);
	}
}
class demo2{
	static void multiplication(int x, int y){
       demo1 v=new demo1();
       v.add(12, 13);
       int res=(x*y);
       System.out.println("Multiply:"+res);
	}
}
public class StaticCaseThree {

	public static void main(String[] args) {
     demo2.multiplication(12,13);
	}

}
