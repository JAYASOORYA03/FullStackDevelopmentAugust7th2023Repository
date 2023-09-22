package com.gentech.classes;

class TwoWheeler{
	String bikeName;
	String bikeModel;
	String bikeColor;
	float price;

}
class FourWheeler{
	String carName;
	String carModel;
	String carColor;
	float price;
}
class HeavyWheeler{
	String vehName;
	String brandName;
	String loadCapacity;
	float price;
}


public class TwoFourHeavyWheeler {

	public static void main(String[] args) {

		TwoWheeler two=new TwoWheeler();
		two.bikeName="RoyalEnfeild";
		two.bikeModel=" classic350";
		two.bikeColor="Red";
		two.price=120000;
		System.out.println("BikeName:"+two.bikeName);
		System.out.println("BikeModel:"+two.bikeModel);
		System.out.println("BikeColor:"+two.bikeColor);
		System.out.println("BikePrice:"+ two.price);
		System.out.println("--------------------------");

		FourWheeler four=new FourWheeler();
		four.carName="Audi";
		four.carModel="Audi A6";
		four.carColor="Black";
		four.price=4500000;
		System.out.println("CarName:"+four.carName);
		System.out.println("CarModel:"+four.carModel);
		System.out.println("CarColor:"+four.carColor);
		System.out.println("CarPrice:"+four.price);

		System.out.println("--------------------------");

		HeavyWheeler heavy=new HeavyWheeler();
		heavy.vehName="Ashok Leland";
		heavy.brandName="Eicher";
		heavy.loadCapacity="44Tones";
		heavy.price=700000;
		System.out.println("VehName:"+heavy.vehName);
		System.out.println("BrandName:"+heavy.brandName);
		System.out.println("LoadCapacity:"+heavy.loadCapacity);
		System.out.println("Price"+heavy.price);

	}

}



