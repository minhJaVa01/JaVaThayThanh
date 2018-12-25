/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.edu.model;

/**
 *
 * @author nguye
 */
public class NhanVien implements Comparable<NhanVien>{
    private int ma;
    private String ten;

    public NhanVien() {
    }

    public NhanVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", ten=" + ten + '}';
    }
    
    // = 0=>bang nhau
    //>0=>>
    @Override
    public int compareTo(NhanVien o) {
        if (this.ma==o.ma) {
            return 0;
        }
        if (this.ma>o.ma) {
            return 1;
        }
        return -1;
    }
    
    
}
