package music;
import java.util.ArrayList;
import com.sun.org.apache.bcel.internal.generic.MULTIANEWARRAY;

import java.util.SortedMap;

public class Favourites {

    private ArrayList<MusicTrack> musicTrack;
    private int counter;
    private MusicTrack excess;

    public Favourites(){
        counter = 0;
        excess = null;
        musicTrack = new ArrayList<>();
    }

    public void addTrack(String artist, String title){

        if (artist != null && title != null) {
            musicTrack.add(new MusicTrack(artist,title));
            counter++;
        } else {
            excess = new MusicTrack(artist,title);
            System.out.println("Sorry, can't add: " + excess.toString());
            System.out.println("");
        }

    }

    public void showFavourites() {
        if (musicTrack.size() != 0) {
            for (int i = 0; i < musicTrack.size(); i++) {
                if (musicTrack.get(i) != null) {
                    System.out.println(musicTrack.get(i).toString());
                }
            }
        }
    }
}
