public class MusicTrack {

    private String musicArtist;
    private String musicTitle;
    private String[] list;


    public MusicTrack (String artist, String title) {
        musicArtist = artist;
        musicTitle = title;
        list = new String[]{musicArtist, musicArtist};
    }

    public String getArtist() {
        return musicArtist;
    }

    public String getTitle() {
        return musicTitle;
    }

    public String toString() {
        return getTitle() + " | " + getArtist();
    }

}
