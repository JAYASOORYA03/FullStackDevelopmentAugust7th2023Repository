package com.gentech.parametrized;



class Student
{
	Student(String StudentFirstName,int age,int id,String branch){


		System.out.println("StudentFirstName:"+StudentFirstName);
		System.out.println("Age:"+age);
		System.out.println("id:"+id);
		System.out.println("branch;"+branch);
		System.out.println("----------------------");
	}
}  

class Library
{
	Library(String LibraryType,String LibraryName,int id,String Location){
		System.out.println("LibraryName:"+LibraryName);
		System.out.println("LibraryType="+LibraryType);
		System.out.println("id:"+id);
		System.out.println("Location:"+Location);
		System.out.println("-----------------------");
	}
}

class Sports
{
	Sports(String SportsName,String SportsSponser,String PlayerName,int Jersyid){



		System.out.println("SportsName:"+SportsName);
		System.out.println("SportsSponser:"+SportsSponser);
		System.out.println("PlayerName:"+PlayerName);
		System.out.println("Jersyid:"+Jersyid);
	}
}
public class StudentLibrarySports {

	public static void main(String[] args) {
		Student Guna= new Student("Guna",21,4707,"Engineering");


		Library Lib=new Library("Government","Tamil",9080,"Kanchipuram");


		Sports Sp= new Sports("Cricket","Addidas","Virat Kolhi",18);


	}

}
