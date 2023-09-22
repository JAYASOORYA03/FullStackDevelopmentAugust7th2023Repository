package com.gentech.inheritance;

class akm {
    String familynames;
    int income;
    int houseno;
    String fathername;

    akm(String name, int r, String f) {
    	familynames = name;
    	income = r;
        fathername = f;

        System.out.println("Super Class name : " + familynames);
        System.out.println("Roll no : " + income);
        System.out.println("Father Name : " + fathername);

    }

    akm(int cc) {
    	houseno = cc;
        System.out.println("Super Class College Code : " + houseno);
    }
}

class akm1 extends akm {
    String mothernames;
    int income;
    int houseno;
    String fathername;

    akm1(String name, int r, String f) {
        super(name, r, f);
        mothernames = name;
        income = r;
        fathername = f;
    }

    akm1(int cc) {
        super(cc);
        income = cc;
        System.out.println("Mother Name:"+mothernames);
    }
}

class akm2 extends akm1 {
    String Gruadiannames = "";
    int rollno;
    int mobilenum;
    String fathername;

    akm2(String name, int r, String f) {
        super(name, r, f);
        mothernames = name;
        rollno = r;
        fathername = f;
    }

    akm2(int cc) {
        super(cc);
        mobilenum = cc;
        System.out.println("Gruadian Name:"+Gruadiannames);
    }
}

public class Multilevelseven {
    public static void main(String[] args) {
    	akm2 obj = new akm2("Jayasoorya", 47, "Eagambaram");
    	akm2 obj2 = new akm2(4707);
    	akm2 obj3 = new akm2("punith", 57, "ramesh");
    	akm2 obj4 = new akm2(4806);
    }
}


	


