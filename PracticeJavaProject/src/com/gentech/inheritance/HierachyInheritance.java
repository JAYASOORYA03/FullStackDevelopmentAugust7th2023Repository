package com.gentech.inheritance;

class Hierarchy {
    void divisibleByFour(int i) {
        if (i%4==0) {
            System.out.println(i + " is divisible by four");
        }
    }
}

class Hierarchy1 extends Hierarchy {
     void divisibleBySix(int i) {
        if (i%6==0) {
            System.out.println(i + " is divisible by six");
        }
    }
}

class Hierarchy2 extends Hierarchy {
     void divisibleByEight(int i) {
        if (i%8==0) {
            System.out.println(i + " is divisible by eight");
        }
    }
}

public class HierachyInheritance {
    public static void main(String[] args) {
        Hierarchy1 o = new Hierarchy1();
        o.divisibleByFour(40);
        o.divisibleBySix(60);
        
        Hierarchy2 o1 = new Hierarchy2();
        o1.divisibleByEight(80);
        o1.divisibleByFour(60);
    }
}
