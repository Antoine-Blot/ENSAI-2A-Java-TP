package fr.ensai.mediaplayer;

public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    @Override public String toString() {
        return "Artist " + firstName + " " + lastName;
    }
}
