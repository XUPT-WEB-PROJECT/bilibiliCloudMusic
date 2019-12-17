package bean;

import java.util.Date;

public class Album {

    private int albumId;

    private String albumName;

    private String albumPicture;

    private int singerId;

    private String singerName;

    private String albumIntro;

    private Date albumIssueDate;

    public Album(){}

    public Album(int albumId, String albumName, String albumPicture, int singerId, String singerName, String albumIntro, Date albumIssueDate) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.albumPicture = albumPicture;
        this.singerId = singerId;
        this.singerName = singerName;
        this.albumIntro = albumIntro;
        this.albumIssueDate = albumIssueDate;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
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

    public String getAlbumIntro() {
        return albumIntro;
    }

    public void setAlbumIntro(String albumIntro) {
        this.albumIntro = albumIntro;
    }

    public Date getAlbumIssueDate() {
        return albumIssueDate;
    }

    public void setAlbumIssueDate(Date albumIssueDate) {
        this.albumIssueDate = albumIssueDate;
    }
}
