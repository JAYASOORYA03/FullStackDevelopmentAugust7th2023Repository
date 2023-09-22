package com.gentech.polymorphism;

abstract class WeatherConditions {
    abstract void seasons();
}

class Season extends WeatherConditions {
    void seasons() {
        String seasonName;
        int windspeed;
        seasonName = "Summer";
        windspeed = 50;
        System.out.println("SEASON NAME: " + seasonName);
        System.out.println("WIND SPEED: " + windspeed);
    }
}

class Winter extends WeatherConditions {
    void seasons() {
        String seasonName;
        int snowfall;
        seasonName = "Winter";
        snowfall = 20; 
        System.out.println("SEASON NAME: " + seasonName);
        System.out.println("SNOWFALL: " + snowfall + " inches");
    }
}

class Spring extends WeatherConditions {
    void seasons() {
        String seasonName;
        int temperature;
        seasonName = "Spring";
        temperature = 65; 
        System.out.println("SEASON NAME: " + seasonName);
        System.out.println("TEMPERATURE: " + temperature + "°F");
    }
}

class Fall extends WeatherConditions {
    void seasons() {
        String seasonName;
        int leavesFalling;
        seasonName = "Fall";
        leavesFalling = 5000; 
        System.out.println("SEASON NAME: " + seasonName);
        System.out.println("LEAVES FALLING: " + leavesFalling + " per day");
    }
}

class Monsoon extends WeatherConditions {
    void seasons() {
        String seasonName;
        int rainfall;
        seasonName = "Monsoon";
        rainfall = 12; 
        System.out.println("SEASON NAME: " + seasonName);
        System.out.println("RAINFALL: " + rainfall + " inches per month");
    }
}

public class Assignmentpolymorphism {

	public static void main(String[] args) {
        WeatherConditions wc = null;
        
        Season s = new Season();
        Winter w = new Winter();
        Spring sp = new Spring();
        Fall f = new Fall();
        Monsoon m = new Monsoon();

        wc = s;
        wc.seasons(); 
        
        wc = w;
        wc.seasons(); 
        
        wc = sp;
        wc.seasons(); 
        
        wc = f;
        wc.seasons(); 
        
        wc = m;
        wc.seasons(); 
    }
}


		
