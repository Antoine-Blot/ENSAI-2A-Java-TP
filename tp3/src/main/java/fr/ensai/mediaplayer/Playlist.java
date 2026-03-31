package fr.ensai.mediaplayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    
    private String name;
    private List<Media> mediaList;
    private int totalDuration;

    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
        this.totalDuration = 0;
    }

    public void addMedia(Media media) {
        this.mediaList.add(media);
        this.totalDuration += media.getDuration();
    }

    public boolean removeMedia(Media media) {
        boolean removed = false;
        
        // remove all occurrences
        while (mediaList.remove(media)) {
            totalDuration -= media.getDuration();
            removed = true;
        }

        return removed;
    }
}