/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.edu.model;

import java.io.Serializable;

/**
 *
 * @author nguye
 */
public class KhachHang implements Serializable{
    private String maKh;
    private String ten;
    private String phoneNumber;

    public KhachHang() {
    }

    public KhachHang(String maKh, String ten, String phoneNumber) {
        this.maKh = maKh;
        this.ten = ten;
        this.phoneNumber = phoneNumber;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKh=" + maKh + ", ten=" + ten + ", phoneNumber=" + phoneNumber + '}';
    }
    
    
}
