package com.gentech.constructoroverloading;

class Student{
	String name;
	int StudentId;
	String StudentBranch;
	int fees;

	Student(String n, int id) {
		name = n;
		StudentId = id;
		System.out.println("Student Name : " + name);
		System.out.println("Student code : " + StudentId);
	}

	Student() {

	}

	Student(String sb) {
		StudentBranch = sb;
		System.out.println("Student Branch : " + StudentBranch);

	}
	Student(int ab){
		fees=ab;
		System.out.println("Student Fees: "+ fees);}

}

public class StudentsConstructor {

	public static void main(String[] args) {
		Student stu = new Student("Jaya soorya", 4707);
		Student stu1 = new Student("BE.CSE");
		Student stu2 = new Student(45000);

	}

}



