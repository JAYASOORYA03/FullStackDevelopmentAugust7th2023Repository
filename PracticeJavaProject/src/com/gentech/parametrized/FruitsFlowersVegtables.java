package com.gentech.parametrized;
class Fruit{
	Fruit(String FruitName,String hybrid,String fruitColor,int noofMonthtogrow){
		
		System.out.println("FruitName:"+FruitName);
		System.out.println("Hybrid:"+hybrid);
		System.out.println("FruitColor:"+fruitColor);
		System.out.println("No of Years to Grow:"+noofMonthtogrow);
		System.out.println("----------------------");

	}

}
class Flower{
	Flower(String FlowerName,String flowerColor,int noofMonthstogrow){
		
	
		
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("FlowerColor:"+flowerColor);
		System.out.println("No of Months to Grow"+noofMonthstogrow);
		System.out.println("----------------------");
	}
}
class Vegetable{
	Vegetable(String VegName,String vegType,String humanBenifits,int noofMonthstogrow){
	
		
		System.out.println("VegName:"+VegName);
		System.out.println("VegType"+vegType);
		System.out.println("HumanBenefits:"+humanBenifits);
		System.out.println("No of Months to Grow;:"+noofMonthstogrow);

	}
}


public class FruitsFlowersVegtables {

	public static void main(String[] args) {

		Fruit fru=new Fruit("Apple","Ooty Apple","Red",1);
		
		Flower flo=new Flower("Lilly","White",1);
		

		Vegetable veg=new Vegetable("Cumcumber","Root","Eye",1);
		
	}

}




