package fr.ensai.mediaplayer;

public class Podcast extends Media {
    private String host;
    private String topic;
    private int duration;
    private int year;

    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(title, subtitles, duration);
        this.host = host;
        this.topic = topic;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Podcast %s hosted by %s", this.title, this.host);
    }

}