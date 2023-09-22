package com.gentech.noargs;
class Employee
{
	String EmployeeFirstName;
	int age;
	int id;
	String Worktype;
	Employee(){
		EmployeeFirstName="kavin";
		age=21;
		id=5115;
		Worktype="Developer";
		System.out.println("EmployeeFirstName:"+EmployeeFirstName);
		System.out.println("Age:"+age);
		System.out.println("id:"+id);
		System.out.println("worktype;"+Worktype);
		System.out.println("----------------------");
	}
}  

class Department
{
	String DepartmentName;
	int id;
	String Location;
	int Zipcode;
	Department(){
		DepartmentName="School";
		id=9080;
		Location="Kanchipuram";
		Zipcode=631502;
		System.out.println("DepartmentName:"+DepartmentName);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("Zipcode:"+Zipcode);
		System.out.println("-----------------------");

	}
}

class Insurence
{
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
	Insurence(){
		InsurenceName="Bajaji";
		InsurenceType="Life Insurence";
		CustomerName="Guna";
		id=6383;
		System.out.println("InsurenceName:"+InsurenceName);
		System.out.println("InsurenceType:"+InsurenceType);
		System.out.println("CustomerName:"+CustomerName);
		System.out.println("id:"+id);
	}
}

public class EmpDeptInsur {

	public static void main(String[] args) {

		Employee k= new Employee();
		
		Department School=new Department();
		
		Insurence Life= new Insurence();
		
	}
}










