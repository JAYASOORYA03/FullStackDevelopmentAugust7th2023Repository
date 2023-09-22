package com.gentech.inheritance;

class sub {
	String hospitalnames;
	int hosno;
	int pincode;

	sub(String name, int r) {
		hospitalnames = name;
		hosno = r;

		System.out.println("Super Class name : " + hospitalnames);
		System.out.println("Roll no : " + hosno);
	}

	sub(int cc) {
		pincode = cc;
		System.out.println("Super Class College Code : " + pincode);
	}
}

class sub1 extends sub {
	String Doctornames;
	int Docid;
	int pincode;

	sub1(String name, int r) {
		super(name, r);
		Doctornames = name;
		Docid = r;
		System.out.println("Child Class 1 doctorname : " + Doctornames);
		System.out.println("Roll no : " + Docid);
	}

	sub1(int cc) {
		super(cc);
		pincode = cc;
		System.out.println("Child class 1 pinCode : " + pincode);
	}
}

class sub2 extends sub1 {
	String deptnames = "";
	int deptno;
	int deptcode;

	sub2(String name, int r) {
		super(name, r);
		deptnames = name;
		deptno = r;
		System.out.println("Child Class 2 deptnames : " + deptnames);
		System.out.println("Roll no : " + deptno);
	}

	sub2(int cc) {
		super(cc);
		pincode = cc;
		System.out.println("Child Class 2 College Code : " + pincode);
	}
}

class sub3 extends sub {
	String batchnames = "";
	int no;
	int pincode;

	sub3(String name, int r) {
		super(name, r);
		batchnames = name;
		no = r;
		System.out.println("Child Class 2 name : " + batchnames);
		System.out.println("Roll no : " + no);
	}

	sub3(int cc)
	{
		super(cc);
		pincode = cc;
		System.out.println("Child Class 2 College Code : " +pincode);
	}
}

public class HybridNine {

	public static void main(String[] args) {
		sub1 ob = new sub1("GH", 24);
		System.out.println();
		System.out.println();
		
		sub1 ob2 = new sub1(560075);
		System.out.println();
		System.out.println();
		
		sub3 ob3 = new sub3("surgery", 11);
		System.out.println();
		System.out.println();
		
		sub3 ob4 = new sub3(560098);
	}

}




