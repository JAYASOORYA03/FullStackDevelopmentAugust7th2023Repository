package com.gentech.classes;
class Fruit{
	String FruitName;
	String hybrid;
	String fruitColor;
	int noofMonthtogrow;

}
class Flower{
	String FlowerName;
	String flowerColor;
	int noofMonthstogrow;
}
class Vegetable{
	String VegName;
	String vegType;
	String humanBenifits;
	int noofMonthstogrow;
}


public class FruitsFlowersVegtables {

	public static void main(String[] args) {

		Fruit fru=new Fruit();
		fru.FruitName="Apple";
		fru.hybrid="Ooty Apple";
		fru.fruitColor="Red";
		fru.noofMonthtogrow=1;
		System.out.println("FruitName:"+fru.FruitName);
		System.out.println("Hybrid:"+fru.hybrid);
		System.out.println("FruitColor:"+fru.fruitColor);
		System.out.println("No of Years to Grow:"+fru.noofMonthtogrow);
		System.out.println("----------------------");

		Flower flo=new Flower();
		flo.FlowerName="Lilly";
		flo.flowerColor="White";
		flo.noofMonthstogrow=1;
		System.out.println("FlowerName:"+flo.FlowerName);
		System.out.println("FlowerColor:"+flo.flowerColor);
		System.out.println("No of Months to Grow"+flo.noofMonthstogrow);
		System.out.println("----------------------");

		Vegetable veg=new Vegetable();
		veg.VegName="Cumcumber";
		veg.vegType="Root";
		veg.humanBenifits="Eye";
		veg.noofMonthstogrow=1;
		System.out.println("VegName:"+veg.VegName);
		System.out.println("VegType"+veg.vegType);
		System.out.println("HumanBenefits:"+veg.humanBenifits);
		System.out.println("No of Months to Grow;:"+veg.noofMonthstogrow);

	}

}




