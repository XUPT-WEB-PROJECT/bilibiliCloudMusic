package bean;

public class Music {

    private int musicId;

    private int singerId;

    private String musicName;

    private String singerName;

    private String albumName;

    private String albumPicture;

    private String MVPicture;

    private int albumId;

    private String musicURL;

    private String lyricURL;

    private String length;

    public Music(){}

    public Music(int musicId, int singerId, String musicName, String singerName, String albumName, String albumPicture, String MVPicture, int albumId, String musicURL, String lyricURL, String length) {
        this.musicId = musicId;
        this.singerId = singerId;
        this.musicName = musicName;
        this.singerName = singerName;
        this.albumName = albumName;
        this.albumPicture = albumPicture;
        this.MVPicture = MVPicture;
        this.albumId = albumId;
        this.musicURL = musicURL;
        this.lyricURL = lyricURL;
        this.length = length;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumPicture() {
        return albumPicture;
    }

    public void setAlbumPicture(String albumPicture) {
        this.albumPicture = albumPicture;
    }

    public String getMVPicture() {
        return MVPicture;
    }

    public void setMVPicture(String MVPicture) {
        this.MVPicture = MVPicture;
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

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
