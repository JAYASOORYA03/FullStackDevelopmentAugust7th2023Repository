package com.gentech.classes;
class Desktop 
{
	String Desktopbrand;
	String model;
	int ramSizeGB;
	String isSSDSupported;

}

class Laptop 
{
	String Laptopbrand;
	String model;
	double screenSizeInches;
	int batteryCapacity;

}

class Mobile
{
	String Mobilebrand;
	String model;
	String operatingSystem;
	String isMobileDataEnabled;

}

public class DesktopLaptopMobile {

	public static void main(String[] args) {
		Desktop D=new Desktop();
		D.Desktopbrand="Acer";
		D.model="S320";
		D.ramSizeGB=812;
		D.isSSDSupported="No";
		System.out.println("Desktop Brand:"+D.Desktopbrand);
		System.out.println("model no.:"+D.model);
		System.out.println("ramSize:"+D.ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+D.isSSDSupported);
		System.out.println("-----------------------------------------");

		Laptop L=new Laptop();
		L.Laptopbrand="Dell";
		L.model="One14";
		L.screenSizeInches=16.5;
		L.batteryCapacity=8000;
		System.out.println("Laptop Brand:"+L.Laptopbrand);
		System.out.println("Model:"+L.model);
		System.out.println("Screen Size:"+L.screenSizeInches+" inches");
		System.out.println("Battery capacity:"+L.batteryCapacity);
		System.out.println("-----------------------------------------");

		Mobile M=new Mobile();
		M.Mobilebrand="IPHONE";
		M.model="14pro";
		M.operatingSystem="iOS";
		M.isMobileDataEnabled="No";
		System.out.println("Mobile Brand:"+M.Mobilebrand);
		System.out.println("Model :"+M.model);
		System.out.println("OS :"+M.operatingSystem);
		System.out.println("Is the MobileData enabled:"+M.isMobileDataEnabled);



	}

}


