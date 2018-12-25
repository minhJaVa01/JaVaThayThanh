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
public class NhanVienThoiVu extends NhanVien{

    @Override
    public int xuatLuong() {
        return 10000;
    }

    @Override
    public String toString() {
        return  this.ten + xuatLuong() +"==> vi la nhan vien thoi vu";
    }
    
    
}
