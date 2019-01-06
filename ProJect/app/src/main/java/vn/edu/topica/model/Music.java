package vn.edu.topica.model;

public class Music {
    private String ma;
    private String ten;
    private String caSy;
    private boolean like;





    /**
     *
     */
    public Music() {
    }

    public Music(String ma, String ten, String caSy, boolean like) {
        this.ma = ma;
        this.ten = ten;
        this.caSy = caSy;
        this.like = like;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return this.ma + this.ten +this.caSy +this.like ;
    }
}
