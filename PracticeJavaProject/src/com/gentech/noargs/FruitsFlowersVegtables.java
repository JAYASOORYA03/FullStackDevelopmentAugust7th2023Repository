package com.gentech.noargs;
class Fruit{
	String FruitName;
	String hybrid;
	String fruitColor;
	int noofMonthtogrow;
	Fruit(){
		FruitName="Apple";
		hybrid="Ooty Apple";
		fruitColor="Red";
		noofMonthtogrow=1;
		System.out.println("FruitName:"+FruitName);
		System.out.println("Hybrid:"+hybrid);
		System.out.println("FruitColor:"+fruitColor);
		System.out.println("No of Years to Grow:"+noofMonthtogrow);
		System.out.println("----------------------");

	}

}
class Flower{
	String FlowerName;
	String flowerColor;
	int noofMonthstogrow;
	Flower(){
		FlowerName="Lilly";
		flowerColor="White";
		noofMonthstogrow=1;
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("FlowerColor:"+flowerColor);
		System.out.println("No of Months to Grow"+noofMonthstogrow);
		System.out.println("----------------------");
	}
}
class Vegetable{
	String VegName;
	String vegType;
	String humanBenifits;
	int noofMonthstogrow;
	Vegetable(){
		VegName="Cumcumber";
		vegType="Root";
		humanBenifits="Eye";
		noofMonthstogrow=1;
		System.out.println("VegName:"+VegName);
		System.out.println("VegType"+vegType);
		System.out.println("HumanBenefits:"+humanBenifits);
		System.out.println("No of Months to Grow;:"+noofMonthstogrow);

	}
}


public class FruitsFlowersVegtables {

	public static void main(String[] args) {

		Fruit fru=new Fruit();
		
		Flower flo=new Flower();
		

		Vegetable veg=new Vegetable();
		
	}

}




