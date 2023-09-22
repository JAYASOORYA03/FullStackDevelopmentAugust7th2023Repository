package com.gentech.inheritance;

class Multilevel {
    void calculateSquareSum(int x, int y) {
        int sqre = 0;
        for (int i=x;i>=y;i--) { 
            sqre=sqre+(i*i);
        }
        System.out.println(+sqre);
    }
}

class Multilevel1 extends Multilevel {
	void calculateSquareSum(int x, int y) {
        int sqre = 0;
        for (int i=x;i>=y;i--) {
            sqre=sqre+(i*i);
        }
        System.out.println(+sqre);
    }
}

class Multilevel2 extends Multilevel1 {
	void calculateSquareSum(int x, int y) {
        int sqre = 0;
        for (int i=x;i>=y;i--) {
            sqre=sqre+(i*i);
        }
        System.out.println(+sqre);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Multilevel2 o = new Multilevel2();
        o.calculateSquareSum(20, 1); 
        o.calculateSquareSum(30,1);   
        o.calculateSquareSum(40,1);    
    }
}
