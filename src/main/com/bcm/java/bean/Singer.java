package bean;

public class Singer {

    private int singerId;

    private String singerName;

    private String singerAvatar;

    private String singerIntro;

    private int fansNum;

    public Singer(){};

    public Singer(int singerId, String singerName, String singerAvatar, String singerIntro, int fansNum) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAvatar = singerAvatar;
        this.singerIntro = singerIntro;
        this.fansNum = fansNum;
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

    public String getSingerAvatar() {
        return singerAvatar;
    }

    public void setSingerAvatar(String singerAvatar) {
        this.singerAvatar = singerAvatar;
    }

    public String getSingerIntro() {
        return singerIntro;
    }

    public void setSingerIntro(String singerIntro) {
        this.singerIntro = singerIntro;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }
}
