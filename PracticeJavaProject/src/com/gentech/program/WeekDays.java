package com.gentech.program;

public class WeekDays {

	public static void main(String[] args) {
		int weekday = Integer.parseInt(args[0]);
		if(weekday==1) {
			System.out.println("Monday");
		}
		else if(weekday==2) {
			System.out.println("Tuesday");
		}
		else if(weekday==3) {
			System.out.println("Tuesday");
		}
		else if(weekday==4) {
			System.out.println("Wednesday");}
		else if(weekday==5) {
			System.out.println("Thursday");}
		else if(weekday==6) {
			System.out.println("Friday");}
		else if(weekday==7) {
			System.out.println("Saturday");}
		else {
			System.out.println("invalid");
		}
}
}
