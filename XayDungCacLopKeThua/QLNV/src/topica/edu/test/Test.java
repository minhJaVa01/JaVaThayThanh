/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.edu.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import topica.edu.model.NhanVien;

/**
 *
 * @author nguye
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        ds.add(new NhanVien(4,"Aguyễn Chí Vịnh"));
        ds.add(new NhanVien(3,"Bguyễn Lân Dũng"));
        ds.add(new NhanVien(2,"Fhuong Mai Lan"));
        ds.add(new NhanVien(1,"Bhương Đình Đặng"));
        System.out.println("Danh sach nhan vien cua cong ty");
        for (NhanVien nv : ds) {
            System.out.println(nv.getTen() + " " +nv.getMa());
        }
        Collections.sort(ds);
        System.out.println("danh sach nhan vien sau khi săp xếp :");
        for (NhanVien nv2 : ds) {
            System.out.println(nv2.getTen() +" "+ nv2.getMa());
        }
    }
    
}
