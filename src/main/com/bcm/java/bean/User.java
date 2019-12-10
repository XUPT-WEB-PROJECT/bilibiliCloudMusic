package bean;

public class User {
    private int userId;
    private String name;
    private String key;
    private String userAvatar;
    private int followNum;
    private int fansNum;

    public User(){ }

    public User(int userId, String name, String key, String userAvatar, int followNum, int fansNum) {
        this.userId = userId;
        this.name = name;
        this.key = key;
        this.userAvatar = userAvatar;
        this.followNum = followNum;
        this.fansNum = fansNum;
    }

    public User(String userName, String password) {
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public void setFollowNum(int followNum) {
        this.followNum = followNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public int getFollowNum() {
        return followNum;
    }

    public int getFansNum() {
        return fansNum;
    }
}
