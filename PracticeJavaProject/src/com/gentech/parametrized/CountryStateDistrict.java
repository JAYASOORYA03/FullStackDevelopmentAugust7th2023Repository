package com.gentech.parametrized;



class Country
{
	Country(String CountryName,String CountryCaptial,String NationalAnimal,int Countrycode){
		System.out.println("CountryName:"+CountryName);
		System.out.println("CountryCaptial:"+CountryCaptial);
		System.out.println("NationalAnimal:"+NationalAnimal);
		System.out.println("Countrycode;"+Countrycode);
		System.out.println("----------------------");
	}



}

class State
{
	State(String StateName,String StateCaptial,	String StateZone,int StateCount){

		System.out.println("StateName:"+StateName);
		System.out.println("StateCaptial="+StateCaptial);
		System.out.println("StateZone:"+StateZone);
		System.out.println("StateCount:"+StateCount);
		System.out.println("-----------------------");



	}
}

class District
{
	District(String DistrictName,String StateName,String DistrictTaluk,int DistrictCode){
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("StateName:"+StateName);
		System.out.println("DistrictTaluk:"+DistrictTaluk);
		System.out.println("DistrictCode:"+DistrictCode);

	}
}
public class CountryStateDistrict {

	public static void main(String[] args) {

		Country ind= new Country("India","Delhi","Tiger",07);
		State Tn=new State("TamilNadu","Chennai","SouthZone",70000000);
		District Kpm= new District("Kanchipuram","TamilNadu","kanchipuram taluk",631);



	}

}



