public class Music {
    // Music Playlist
    private int musicId;
    private String musicName;
    private String musicSinger;

    public Music(int musicId, String musicName, String musicSinger) {
        this.musicId = musicId;
        this.musicName = musicName;
        this.musicSinger = musicSinger;
    }

    public int getMusicId() {
        return musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public String getMusicSinger() {
        return musicSinger;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicId=" + musicId +
                ", musicName='" + musicName + '\'' +
                ", musicSinger='" + musicSinger + '\'' +
                '}';
    }
}
