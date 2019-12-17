package bean;

public class FavorMV {

    private int MVId;

    private int userId;

    public FavorMV(){}

    public FavorMV(int MVId, int userId) {
        this.MVId = MVId;
        this.userId = userId;
    }

    public int getMVId() {
        return MVId;
    }

    public void setMVId(int MVId) {
        this.MVId = MVId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
