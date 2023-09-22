package com.gentech.constructoroverloading;

            class Product {
			String name;
			int Product_code;
			int Product_Price;
			String source;

			Product(String n, int pc) {
				name = n;
				Product_code = pc;
				System.out.println("Product Name : " + name);
				System.out.println("Product code : " + Product_code);
			}

			Product(int pc) {
				Product_Price = pc;
				System.out.println("Product_Price : " + Product_Price);

			}
			Product(String ab){
				source=ab;
			    System.out.println("Product Source: "+ source);}


			Product() {

			}

		}

		public class ProductsConstructor {

			public static void main(String[] args) {

				Product pd = new Product("Iphone", 7895);
				Product pd1 = new Product(1200000);
				Product pd2 = new Product("Online");

			}

		}
	
