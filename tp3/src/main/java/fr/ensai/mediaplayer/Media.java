package fr.ensai.mediaplayer;

import java.util.Objects;

/**
 * Represents a media with essential attributes.
 */
public abstract class Media {
    protected String title;
    protected String content;

    protected Media(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void play() {
        String[] words = content.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
            }
        }
        System.out.println();
    }

}