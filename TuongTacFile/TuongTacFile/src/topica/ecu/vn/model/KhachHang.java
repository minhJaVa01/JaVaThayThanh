/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.ecu.vn.model;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class KhachHang implements Serializable{
    private String ma;
    private String ten;

    public KhachHang() {
    }

    public KhachHang(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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

    @Override
    public String toString() {
        return this.ma + "\t " + this.ten;
    }
}
