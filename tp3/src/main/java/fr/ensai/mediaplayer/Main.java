package fr.ensai.mediaplayer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Song song = new Song(null, null, 2000, 60, "a b c d e f g h i j k l m n", null, null, List.of(Genre.POP, Genre.ROCK));
        Podcast podcast = new Podcast(null, null, null, 100, 2000, "m n o p q r s t u v w x y z");
        podcast.play();
    }
}