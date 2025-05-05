package at.technikum.oop.library.items;

public class CD extends Item implements Rentable {

    private String title;
    private String artist;
    private int trackNr;

    public CD(
            String title,
            String artist,
            int trackNr,
            boolean available
    ) {
        super(available);
        this.title = title;
        this.artist = artist;
        this.trackNr = trackNr;
    }

    @Override
    public void print() {
        System.out.printf("CD %s %s%n", this.title, this.id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackNr() {
        return trackNr;
    }

    public void setTrackNr(int trackNr) {
        this.trackNr = trackNr;
    }
}
