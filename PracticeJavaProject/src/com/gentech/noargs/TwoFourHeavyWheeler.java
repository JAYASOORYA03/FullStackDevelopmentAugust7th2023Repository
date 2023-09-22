package com.gentech.noargs;

class TwoWheeler{
	String bikeName;
	String bikeModel;
	String bikeColor;
	float price;
	TwoWheeler(){
		bikeName="RoyalEnfeild";
		bikeModel=" classic350";
		bikeColor="Red";
		price=120000;
		System.out.println("BikeName:"+bikeName);
		System.out.println("BikeModel:"+bikeModel);
		System.out.println("BikeColor:"+bikeColor);
		System.out.println("BikePrice:"+ price);
		System.out.println("--------------------------");

	}

}
class FourWheeler{
	String carName;
	String carModel;
	String carColor;
	float price;
	FourWheeler(){
		carName="Audi";
		carModel="Audi A6";
		carColor="Black";
		price=4500000;
		System.out.println("CarName:"+carName);
		System.out.println("CarModel:"+carModel);
		System.out.println("CarColor:"+carColor);
		System.out.println("CarPrice:"+price);

		System.out.println("--------------------------");
	}
}
class HeavyWheeler{
	String vehName;
	String brandName;
	String loadCapacity;
	float price;
	HeavyWheeler(){
		vehName="Ashok Leland";
		brandName="Eicher";
		loadCapacity="44Tones";
		price=700000;
		System.out.println("VehName:"+vehName);
		System.out.println("BrandName:"+brandName);
		System.out.println("LoadCapacity:"+loadCapacity);
		System.out.println("Price"+price);
	}
}


public class TwoFourHeavyWheeler {

	public static void main(String[] args) {

		TwoWheeler two=new TwoWheeler();
		
		FourWheeler four=new FourWheeler();
		

		HeavyWheeler heavy=new HeavyWheeler();
		

	}

}



