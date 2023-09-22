package com.gentech.inheritance;

class goa {
	String nm;

	void show() {
		System.out.println("The Parent class:" + nm);
	}
}

class apple extends goa {
	String nm;

	apple(String s1, String s2) {
		super.nm = s1;
		this.nm = s2;
	}

	void show2() {
		System.out.println("The sub class:" + nm);
	}

}

class orange extends apple {
	String nm;

	orange(String s1, String s2, String s3) {
		super(s1, s2);
		this.nm = s3;
	}

	void show3() {
		System.out.println("The Second sub class:" + nm);
	}

}


public class Assigmnet2 {

	public static void main(String[] args) {
		orange o = new orange("Goa", "Orange", "Apple");
		o.show();
		o.show2();
		o.show3();

	}

}






