package com.gentech.parametrized;
class Desktop 
{
	Desktop(String Desktopbrand,String model,int ramSizeGB,String isSSDSupported){
	    System.out.println("Desktop Brand:"+Desktopbrand);
		System.out.println("model no.:"+model);
		System.out.println("ramSize:"+ramSizeGB+" GB");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("-----------------------------------------");
	}

}

class Laptop 
{
	Laptop(String Laptopbrand,String model,double screenSizeInches,int batteryCapacity){
		System.out.println("Laptop Brand:"+Laptopbrand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("-----------------------------------------");

	}

}

class Mobile
{
	Mobile(String Mobilebrand,String model,String operatingSystem,String isMobileDataEnabled){
		
        System.out.println("Mobile Brand:"+Mobilebrand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("Is the MobileData enabled:"+isMobileDataEnabled);
    }
}

public class DesktopLaptopMobile {

	public static void main(String[] args) {
		Desktop D=new Desktop("Acer","S320",812,"No");
		

		Laptop L=new Laptop("Dell","One14",16.5,8000);
		
		Mobile M=new Mobile("IPHONE","14pro","iOS","No");




	}

}


