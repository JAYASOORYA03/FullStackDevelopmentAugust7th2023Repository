package com.gentech.classes;
class Employee
{
	String EmployeeFirstName;
	int age;
	int id;
	String Worktype;
}  

class Department
{
	String DepartmentName;
	int id;
	String Location;
	int Zipcode;
}

class Insurence
{
	String InsurenceName;
	String InsurenceType;
	String CustomerName;
	int id;
}

public class EmpDeptInsur {

	public static void main(String[] args) {

		Employee k= new Employee();
		k.EmployeeFirstName="kavin";
		k.age=21;
		k.id=5115;
		k.Worktype="Developer";
		System.out.println("EmployeeFirstName:"+k.EmployeeFirstName);
		System.out.println("Age:"+k.age);
		System.out.println("id:"+k.id);
		System.out.println("worktype;"+k.Worktype);
		System.out.println("----------------------");

		Department School=new Department();
		School.DepartmentName="School";
		School.id=9080;
		School.Location="Kanchipuram";
		School.Zipcode=631502;
		System.out.println("DepartmentName:"+School.DepartmentName);
		System.out.println("id:"+School.id);
		System.out.println("Location:"+School.Location);
		System.out.println("Zipcode:"+School.Zipcode);
		System.out.println("-----------------------");

		Insurence Life= new Insurence();
		Life.InsurenceName="Bajaji";
		Life.InsurenceType="Life Insurence";
		Life.CustomerName="Guna";
		Life.id=6383;
		System.out.println("InsurenceName:"+Life.InsurenceName);
		System.out.println("InsurenceType:"+Life.InsurenceType);
		System.out.println("CustomerName:"+Life.CustomerName);
		System.out.println("id:"+Life.id);
	}
}










