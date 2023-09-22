package com.gentech.constructoroverloading;

class books {
	String name;
	int book_code;
	String book_author;
	int book_prize;


	books(String n, int bc) {
		name = n;
		book_code = bc;
		System.out.println("Book Name : " + name);
		System.out.println("Book code : " + book_code);


	}

	books(String ba) {
		book_author = ba;
		System.out.println("Book Author : " + book_author);
	}

	books(int ab){
		book_prize=ab;
		System.out.println("Book Prize: "+ book_prize);
	}

	books() {

	}

}

public class BooksConstructor {

	public static void main(String[] args) {
		books bk = new books("Python", 1002);
		books bk1 = new books("Patil");
		books bk2 = new books (999);

	}

}

