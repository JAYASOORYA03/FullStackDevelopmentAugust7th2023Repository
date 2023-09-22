package com.gentech.inheritance;

class sum {
	String Districtnames;
	int districtcode;
	int pincode;

	sum(String name, int r, int cc) {
		Districtnames = name;
		districtcode = r;
		pincode = cc;
		System.out.println("Super Class name : " + Districtnames);
		System.out.println("Roll no : " + districtcode);
		System.out.println("College Code : " + pincode);
	}
}

class sum1 extends sum {
	String Schoolnames;
	int schoolidno;
	int pincode;

	sum1(String name, int r, int cc) {
		super(name, r, cc);
		Districtnames = name;
		schoolidno = r;
		pincode = cc;
		System.out.println("District Name:"+Districtnames);
	}
}

class sum2 extends sum1 {
	String Streetnames = "";
	int streetno;
	int pincode;

	sum2(String name, int r, int cc) {
		super(name, r, cc);
		Districtnames = name;
		streetno = r;
		pincode = cc;
		System.out.println("StreetName:"+Streetnames);
		
	}
}

class sum3 extends sum {
	String Districtnames = "";
	int disno;   
	int pincode;

	sum3(String name,int r,int cc)
	{
		super(name,r,cc);
		Districtnames = name;
		disno = r;
		pincode = cc;
		System.out.println("District Name:"+Districtnames);
	}
}

public class HybridEight {

	public static void main(String[] args) {
		sum2 obj = new sum2("kanchipuram", 07, 631502);
		sum3 obj2 = new sum3("salam", 47,631501);
		sum3 obj3 = new sum3("bangalore", 66,631502);
		sum3 obj4= new sum3("chennai", 66,631502);
		
	}
}



	