/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.model;

/**
 *
 * @author nguye
 */
public class KhachHang {

    private String ma;
    private String ten;
    private int tuoi;
    private String diaChi;

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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public KhachHang(String ma, String ten, int tuoi, String diaChi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public KhachHang() {
        System.out.println(" Contructor mặc định tự động được gọi");
    }

    @Override
    public String toString() {
        return  this.ma  + this.ten + this.tuoi + this.diaChi ;
    }

   
    
    

}
