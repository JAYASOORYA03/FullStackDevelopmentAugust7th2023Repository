package com.gentech.inheritance;
class Employee {
	Employee(String firstname, int id, String Departmentname, String Companyname, int pincode) {
		System.out.println("Firstname:" + firstname);
		System.out.println("Employee id:" + id);
		System.out.println("Departmentname:" + Departmentname);
		System.out.println("Companyname:" + Companyname);
		System.out.println("Pincode:" + pincode);
	}
}

class Emp extends Employee {
	String interviewmode;

	Emp(String fn, int id, String Departmentname, String Companyname, int pincode, String interviewmode) {
		super(fn, id, Departmentname, Companyname, pincode);
		this.interviewmode = interviewmode;
		System.out.println("InterviewMode:" + interviewmode);
	}
}


public class MultipleInheritence {

	public static void main(String[] args) {
		Emp o=new Emp("Hari",5707,"Development","TCS",631502,"online");
		Emp o1=new Emp("suriya",5706,"Testing","HCL",631502,"offline");
	}

}
