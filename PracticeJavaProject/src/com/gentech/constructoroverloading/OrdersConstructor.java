package com.gentech.constructoroverloading;

		class Order {
			String name;
			int Ordercode;
			String OrderSource;
			int orderprize;

			Order(String n, int oc) {
				name = n;
				Ordercode = oc;
				System.out.println("Order Name : " + name);
				System.out.println("Order code : " + Ordercode);
			}

			Order() {

			}

			Order(String os) {
				OrderSource = os;
				System.out.println("Ordersource : " + OrderSource);

			}
			Order(int ab){
				orderprize=ab;
			    System.out.println("Order Prize: "+ orderprize);}

		}

		public class OrdersConstructor {

			public static void main(String[] args) {

				Order or = new Order("Biri", 45);
				Order or1 = new Order("Zomato");
                Order or2 = new Order(160);
			}

		}
	
