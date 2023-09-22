package com.gentech.inheritance;

class level {
	String Employeenames;
	int idno;
	int registernum;

	level(String name, int r, int cc) {
		Employeenames = name;
		idno = r;
		registernum = cc;
		System.out.println("Super Class name : " + Employeenames);
		System.out.println("Roll no : " + idno);
		System.out.println("College Code : " + registernum);
	}
}

class level2 extends level {
	String departmentnames;
	int idno;
	int pinnum;

	level2(String name, int r, int cc) {
		super(name, r, cc);
		departmentnames = name;
		idno = r;
		pinnum = cc;
        System.out.println("mobile number:"+pinnum);
        System.out.println("Teacher Name:"+departmentnames);
	}
}

class a63 extends level2 {
	String ownernames = "";
	int pinno;
	int contactnum;

	a63(String name,int r,int cc)
	{
		super(name,r,cc);
		ownernames = name;
		pinno = r;
		contactnum = cc;
        System.out.println("SubjectName:"+ownernames);

	}
}

public class Multilevelsix {

	public static void main(String[] args) {
		a63 obj = new a63("Jayasoorya", 4707, 5098);
		a63 obj1 = new a63("suriya", 5707, 5098);
		a63 obj2 = new a63("suren", 5707, 5098);
	}

}



