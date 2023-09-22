package com.gentech.inheritance;

class Simple {
     void checkEven(int i) {
        if (i%2==0) {
            System.out.println(i + " is Even Number");
        }
    }
}

class Simple1 extends Simple {
     void checkOdd(int i) {
        if (i%2!=0) {
            System.out.println(i + " is Odd Number");
        }
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Simple1 o = new Simple1();
        o.checkEven(20);
        o.checkOdd(41);
    }
}
