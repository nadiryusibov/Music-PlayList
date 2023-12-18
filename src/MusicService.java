import java.util.ArrayList;
import java.util.List;

public class MusicService {
    // Music Playlist Service and methods
     List<Music> musicList;
    public MusicService() {
        this.musicList = new ArrayList<>();
    }
    // addMusic method
    public void addMusic(int musicId,String musicName,String musicSinger){
        Music music = new Music(musicId,musicName,musicSinger);
        musicList.add(music);
        System.out.println("Musis list added");
    }
    // displayMusic method
    public void displayMusic(){
        for (Music music : musicList){
            System.out.println(music);
        }
    }
    // deleteMusic method
    public void deleteMusic(int musicId){
        for (Music music : musicList){
            if (music.getMusicId() == musicId){
                System.out.println("Music deleted in playlist " + musicId);
                musicList.remove(music);
                return;
            }
        }
    }


}
