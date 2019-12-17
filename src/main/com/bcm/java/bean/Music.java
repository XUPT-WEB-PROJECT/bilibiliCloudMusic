package bean;

public class Music {

    private int musicId;

    private String userName;

    private int singerId;

    private int albumId;

    private int MVId;

    private String musicURL;

    private String lyricURL;

    public Music(int musicId, String userName, int singerId, int albumId, int MVId, String musicURL, String lyricURL) {
        this.musicId = musicId;
        this.userName = userName;
        this.singerId = singerId;
        this.albumId = albumId;
        this.MVId = MVId;
        this.musicURL = musicURL;
        this.lyricURL = lyricURL;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getMVId() {
        return MVId;
    }

    public void setMVId(int MVId) {
        this.MVId = MVId;
    }

    public String getMusicURL() {
        return musicURL;
    }

    public void setMusicURL(String musicURL) {
        this.musicURL = musicURL;
    }

    public String getLyricURL() {
        return lyricURL;
    }

    public void setLyricURL(String lyricURL) {
        this.lyricURL = lyricURL;
    }
}
