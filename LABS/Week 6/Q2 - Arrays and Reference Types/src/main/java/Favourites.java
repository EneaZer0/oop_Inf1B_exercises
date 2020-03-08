import com.sun.org.apache.bcel.internal.generic.MULTIANEWARRAY;

import java.util.SortedMap;

public class Favourites {

    private String[] musicTrack;
    private int counter;
    private MusicTrack excess;

    public Favourites(){
        musicTrack = new String[5];
        counter = 0;
        excess = null;
    }

    public void addTrack(String artist, String title){

        if ( counter < 5 && artist != null && title != null) {
            musicTrack[counter] = new MusicTrack(artist,title).toString();
            counter++;
        } else {
            excess = new MusicTrack(artist,title);
            System.out.println("Sorry, can't add: " + excess.toString());
            System.out.println("");
        }

    }


    public  void showFavourites() {
        if (musicTrack[0] != null) {
            for (int i = 0; i < musicTrack.length; i++) {
                if (musicTrack[i] != null) {
                    System.out.println(musicTrack[i]);
                }
            }
        }
    }

}
