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
public class NhanVienChinhThuc extends NhanVien{

    @Override
    public int xuatLuong() {
        return 5000;
    }

    @Override
    public String toString() {
        return xuatLuong() +"==>vi la nhan vien chinh thuc";
    }
    
   
}
