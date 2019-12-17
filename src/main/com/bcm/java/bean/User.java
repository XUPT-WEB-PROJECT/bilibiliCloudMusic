package bean;

public class User {
    private int userId;
    private String userName;
    private String userKey;
    private String userAvatar;
    private int followNum;
    private int fansNum;

    public User(){ }

    public User(int userId, String userName, String userKey, String userAvatar, int followNum, int fansNum) {
        this.userId = userId;
        this.userName = userName;
        this.userKey = userKey;
        this.userAvatar = userAvatar;
        this.followNum = followNum;
        this.fansNum = fansNum;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
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

    public String getUserName() {
        return userName;
    }

    public String getUserKey() {
        return userKey;
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
