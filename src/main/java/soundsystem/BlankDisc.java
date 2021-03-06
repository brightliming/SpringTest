package soundsystem;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

//    public BlankDisc(String title,String artist,List<String> tracks){
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }

    public void play() {
        System.out.println("Playing " + title + " by "+artist);
        for(String track:tracks){
            System.out.println("-Track:" + track);
        }
    }
}
