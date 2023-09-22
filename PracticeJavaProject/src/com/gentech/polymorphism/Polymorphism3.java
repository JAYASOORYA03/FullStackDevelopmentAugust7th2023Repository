package com.gentech.polymorphism;
abstract class Dressing {
	abstract void textile();
}

class Clothes extends Dressing {
	void textile() {
		String gender;
		String clothType;
		int size;
		gender = "Male";
		clothType = "jeans";
		size = 36;
		System.out.println("Gender: " + gender);
		System.out.println("Type: " + clothType);
		System.out.println("Size: " + size);
	}
}

class Shirt extends Dressing {
	void textile() {
		String gender;
		String clothType;
		int size;
		gender = "Male";
		clothType = "shirt";
		size = 40;
		System.out.println("Gender: " + gender);
		System.out.println("Type: " + clothType);
		System.out.println("Size: " + size);
	}
}

class Dress extends Dressing {
	void textile() {
		String gender;
		String clothType;
		int size;
		gender = "Female";
		clothType = "kurdha";
		size = 8;
		System.out.println("Gender: " + gender);
		System.out.println("Type: " + clothType);
		System.out.println("Size: " + size);
	}
}

class Footwear extends Dressing {
	void textile() {
		String gender;
		String clothType;
		int size;
		gender = "Unisex";
		clothType = "sneakers";
		size = 9;
		System.out.println("Gender: " + gender);
		System.out.println("Type: " + clothType);
		System.out.println("Size: " + size);
	}
}

public class Polymorphism3 {
	public static void main(String[] args) {
		Dressing ds = null;
		Clothes c = new Clothes();
		Shirt s = new Shirt();
		Dress d = new Dress();
		Footwear f = new Footwear();

		ds = c;
		ds.textile(); 


		ds = s;
		ds.textile(); 

		ds = d;
		ds.textile(); 

		ds = f;
		ds.textile(); 
	}
}

