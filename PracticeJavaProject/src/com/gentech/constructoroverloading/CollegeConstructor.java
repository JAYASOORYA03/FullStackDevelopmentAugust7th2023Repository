package com.gentech.constructoroverloading;

class college {
	String name;
	int college_code;
	String university_under;
	int collegefees;

	college(String n, int cc) {
		name = n;
		college_code = cc;
		System.out.println("College Name : " + name);
		System.out.println("College code : " + college_code);
	}

	college(String uu) {
		university_under = uu;
		System.out.println("Collge Under University : " + university_under);

	}
	college(int ab){
		collegefees=ab;
	    System.out.println("College Fees: "+ collegefees);}

	college() {

	}
}

public class CollegeConstructor {
	public static void main(String[] args) {
		college clg = new college("PTLee CNCET", 5115);
		college clg1 = new college("Anna University");
		college clg2= new college(1200000);

	}

}

