package bean;

public class Album {

    private int albumId;

    private String albumName;

    private String albumPicture;

    private int singerId;

    private String albumIntro;

    private String albumIssueDate;

    public Album(int albumId, String albumName, String albumPicture, int singerId, String albumIntro, String albumIssueDate) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.albumPicture = albumPicture;
        this.singerId = singerId;
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

    public String getAlbumIntro() {
        return albumIntro;
    }

    public void setAlbumIntro(String albumIntro) {
        this.albumIntro = albumIntro;
    }

    public String getAlbumIssueDate() {
        return albumIssueDate;
    }

    public void setAlbumIssueDate(String albumIssueDate) {
        this.albumIssueDate = albumIssueDate;
    }
}
