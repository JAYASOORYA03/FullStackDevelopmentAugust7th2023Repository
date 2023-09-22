package com.gentech.polymorphism;

interface Entertainment {
    void genre();
}

class Movies implements Entertainment {
    public void genre() {
        String movieGenre;
        String movieName;
        String ottPlatform;
        movieGenre = "Action";
        movieName = "Die Hard";
        ottPlatform = "Netflix";
        System.out.println("Movie Genre: " + movieGenre);
        System.out.println("Movie Name: " + movieName);
        System.out.println("OTT Platform: " + ottPlatform);
    }
}

class Music implements Entertainment {
    public void genre() {
        String musicGenre;
        String artist;
        String platform;
        musicGenre = "Rock";
        artist = "Queen";
        platform = "Spotify";
        System.out.println("Music Genre: " + musicGenre);
        System.out.println("Artist: " + artist);
        System.out.println("Platform: " + platform);
    }
}

class Games implements Entertainment {
    public void genre() {
        String gameGenre;
        String gameName;
        String platform;
        gameGenre = "RPG";
        gameName = "The Elder Scrolls V: Skyrim";
        platform = "PC";
        System.out.println("Game Genre: " + gameGenre);
        System.out.println("Game Name: " + gameName);
        System.out.println("Platform: " + platform);
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {

        Entertainment ent = null;
        Movies movie = new Movies();
        Music music = new Music();
        Games game = new Games();

        ent = movie;
        ent.genre(); 

        ent = music;
        ent.genre(); 

        ent = game;
        ent.genre(); 
    }
}
