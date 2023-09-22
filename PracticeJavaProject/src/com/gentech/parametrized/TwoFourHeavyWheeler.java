package com.gentech.parametrized;

class TwoWheeler{
	TwoWheeler(String bikeName,String bikeModel,String bikeColor,float price){
		
	
		
		System.out.println("BikeName:"+bikeName);
		System.out.println("BikeModel:"+bikeModel);
		System.out.println("BikeColor:"+bikeColor);
		System.out.println("BikePrice:"+ price);
		System.out.println("--------------------------");

	}

}
class FourWheeler{
	FourWheeler(String carName,String carModel,String carColor,float price){
		
        System.out.println("CarName:"+carName);
		System.out.println("CarModel:"+carModel);
		System.out.println("CarColor:"+carColor);
		System.out.println("CarPrice:"+price);

		System.out.println("--------------------------");
	}
}
class HeavyWheeler{
	HeavyWheeler(String vehName,String brandName,String loadCapacity,float price){
		
	
		System.out.println("VehName:"+vehName);
		System.out.println("BrandName:"+brandName);
		System.out.println("LoadCapacity:"+loadCapacity);
		System.out.println("Price"+price);
	}
}


public class TwoFourHeavyWheeler {

	public static void main(String[] args) {

		TwoWheeler two=new TwoWheeler("RoyalEnfeild","classic350","Red",120000);
		
		FourWheeler four=new FourWheeler("Audi","Audi A6","Black",4500000);
		

		HeavyWheeler heavy=new HeavyWheeler("Ashok Leland","Eicher","44Tones",700000);
		

	}

}



