package com.gentech.noargs;
class Desktop 
{
	String Desktopbrand;
	String model;
	int ramSizeGB;
	String isSSDSupported;
	Desktop(){
		Desktopbrand="Acer";
		model="S320";
		ramSizeGB=812;
		isSSDSupported="No";
		System.out.println("Desktop Brand:"+Desktopbrand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("-----------------------------------------");
	}

}

class Laptop 
{
	String Laptopbrand;
	String model;
	double screenSizeInches;
	int batteryCapacity;
	Laptop(){
		Laptopbrand="Dell";
		model="One14";
		screenSizeInches=16.5;
		batteryCapacity=8000;
		System.out.println("Laptop Brand:"+Laptopbrand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("-----------------------------------------");

	}

}

class Mobile
{
	String Mobilebrand;
	String model;
	String operatingSystem;
	String isMobileDataEnabled;
    Mobile(){
    	Mobilebrand="IPHONE";
		model="14pro";
		operatingSystem="iOS";
		isMobileDataEnabled="No";
		System.out.println("Mobile Brand:"+Mobilebrand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);
    }
}

public class DesktopLaptopMobile {

	public static void main(String[] args) {
		Desktop D=new Desktop();
		

		Laptop L=new Laptop();
		
		Mobile M=new Mobile();
		



	}

}


