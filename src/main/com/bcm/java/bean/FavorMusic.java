package bean;

public class FavorMusic {

    private int userId;

    private int musicId;

    public FavorMusic(){}

    public FavorMusic(int userId, int musicId) {
        this.userId = userId;
        this.musicId = musicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }
}
