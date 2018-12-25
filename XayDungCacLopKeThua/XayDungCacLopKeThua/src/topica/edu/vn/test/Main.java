/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.edu.vn.test;

import topica.edu.model.NhanVien;
import topica.edu.model.NhanVienChinhThuc;
import topica.edu.model.NhanVienThoiVu;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        NhanVien teo = new NhanVienThoiVu();
        teo.setTen("nguyen van manh");
        System.out.println(teo );
    }
    
}
