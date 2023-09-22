package com.gentech.interfaces;


interface companyname
{
	void showcom(String s);
}
interface CompanyArea extends companyname
{
	void showcomarea(int n);
}
interface Companytype extends CompanyArea
{
	void showcomtype(String s);
}
interface hikedetails extends companyname
{
	void showhikedet(int n);
}

class showcompany implements hikedetails,Companytype
{
	public void showcom(String s) 
	{
		System.out.println("COMPANY NAME : "+s);
	}
	public void showcomarea(int n)
	{
		System.out.println("COMPANY AREA CODE : "+n);
	}
	public void showcomtype(String s)
	{
		System.out.println("COMPANY TYPE : "+s);
	}

	public void showhikedet(int n)
	{
		System.out.println("HIKE DETAILS : "+n);
	}
}

public class HybridExtends {

	public static void main(String[] args) {


		showcompany o = new showcompany();
		o.showcom("HCL");
		o.showcomtype("HYBRID");
		o.showcomarea(562134);
		o.showhikedet(15000);
	}

}
