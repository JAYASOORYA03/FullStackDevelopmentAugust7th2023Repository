package com.gentech.parametrized;
class Employees
{
	Employees(String EmployeeFirstName,int age,int id,String Worktype){
		System.out.println("EmployeeFirstName:"+EmployeeFirstName);
		System.out.println("Age:"+age);
		System.out.println("id:"+id);
		System.out.println("worktype:"+Worktype);
		System.out.println("----------------------");
	}
}
class Department
{
	Department(String DepartmentName,int id,String Location,int Zipcode){
		System.out.println("DepartmentName:"+DepartmentName);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("Zipcode:"+Zipcode);
		System.out.println("-----------------------");
	}
}
class Insurence
{
	Insurence(String InsurenceName,String InsurenceType,String CustomerName,int id){
		System.out.println("InsurenceName:"+InsurenceName);
		System.out.println("InsurenceType:"+InsurenceType);
		System.out.println("CustomerName:"+CustomerName);
		System.out.println("id:"+id);
	}
}
public class EmployeeDepartmentInsurence {

	public static void main(String[] args) {
		Employees obj=new Employees("kavin",21,5115,"Developer");
        Department obj1=new Department("School",9080,"Kanchipuram",631502);	
        Insurence obj2=new Insurence("Bajaji","Life Insurence","Guna",6383);
	}

}
