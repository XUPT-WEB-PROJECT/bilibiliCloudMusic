package bean;

public class Music {

    private int musicId;

    private String userName;

    private int singerId;

    private String singerName;

    private int albumId;

    private String musicURL;

    private String lyricURL;

    public Music(){}

    public Music(int musicId, String userName, int singerId, String singerName, int albumId, String musicURL, String lyricURL) {
        this.musicId = musicId;
        this.userName = userName;
        this.singerId = singerId;
        this.singerName = singerName;
        this.albumId = albumId;
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

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
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
