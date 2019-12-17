package bean;

public class Blog {

    private int blogId;

    private int userId;

    private String blog;

    private int musicId;

    private String blogPic;

    public Blog() {}

    public Blog(int blogId, int userId, String blog, int musicId, String blogPic) {
        this.blogId = blogId;
        this.userId = userId;
        this.blog = blog;
        this.musicId = musicId;
        this.blogPic = blogPic;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getBlogPic() {
        return blogPic;
    }

    public void setBlogPic(String blogPic) {
        this.blogPic = blogPic;
    }
}
