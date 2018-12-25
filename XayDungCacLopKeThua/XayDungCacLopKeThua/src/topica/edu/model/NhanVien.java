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
public abstract class NhanVien {
    String ten;
    private String cmnd;
    public abstract int xuatLuong();

    public NhanVien() {
    }

    public NhanVien(String ten, String cmnd) {
        this.ten = ten;
        this.cmnd = cmnd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return this.ten +"==>" + xuatLuong();
    }
    
    
}
