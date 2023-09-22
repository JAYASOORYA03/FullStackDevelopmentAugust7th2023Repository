package com.gentech.interfaces;

interface Coursename
{
	void showcourname(String s);
}
interface Coursefees extends Coursename
{
	void showcoufee(int n);
}
interface CourseDate extends Coursefees
{
	void showcoudate(String n);
}

class showallCourse implements CourseDate
{
	public void showcourname(String s) 
	{
		System.out.println("Course Name : "+s);
	}
	public void showcoufee(int n)
	{
		System.out.println("Course Fees : "+n);
	}
	public void showcoudate(String n)
	{
		System.out.println("Instution Name : "+n);
	}

}
public class MultilevelExtends {

	public static void main(String[] args) {

		showallCourse o = new showallCourse();
		o.showcourname("Development");
		o.showcoufee(11000);
		o.showcoudate("Gentech");
}

}
