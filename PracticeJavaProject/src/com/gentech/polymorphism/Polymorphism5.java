package com.gentech.polymorphism;
interface Mobgaming {
    void pc();
}

class Videogames implements Mobgaming {
    public void pc() {
        String gameName;
        String supportMode;
        gameName = "PUBG";
        supportMode = "Mobile";
        System.out.println("Game Name: " + gameName);
        System.out.println("Support Mode: " + supportMode);
    }
}

class RacingGame implements Mobgaming {
    public void pc() {
        String gameName;
        String supportMode;
        gameName = "Need for Speed";
        supportMode = "Console";
        System.out.println("Game Name: " + gameName);
        System.out.println("Support Mode: " + supportMode);
    }
}

class StrategyGame implements Mobgaming {
    public void pc() {
        String gameName;
        String supportMode;
        gameName = "Civilization VI";
        supportMode = "PC";
        System.out.println("Game Name: " + gameName);
        System.out.println("Support Mode: " + supportMode);
    }
}

public class Polymorphism5 {
    public static void main(String[] args) {
        Mobgaming gm = null;
        Videogames vg = new Videogames();
        RacingGame rg = new RacingGame();
        StrategyGame sg = new StrategyGame();

        gm = vg;
        gm.pc(); 

        gm = rg;
        gm.pc(); 

        gm = sg;
        gm.pc(); 
    }
}
