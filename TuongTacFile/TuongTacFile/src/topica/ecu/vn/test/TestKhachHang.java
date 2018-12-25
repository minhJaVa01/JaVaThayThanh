/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.ecu.vn.test;

import java.util.ArrayList;
import topica.ecu.vn.io.TestFileFactory;
import topica.ecu.vn.model.KhachHang;

/**
 *
 * @author nguye
 */
public class TestKhachHang {
    public static void testLuuFile(){
        ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
        dsKH.add(new KhachHang("KH01","AN")); 
        dsKH.add(new KhachHang("KH02","THUY"));
        dsKH.add(new KhachHang("KH03","LINH"));
        boolean kt = TestFileFactory.luuFile(dsKH, "D:\\dulieu.txt");
        if (kt ==true) {
            System.out.println("Đã lưu file thành công");
        }
        else{
            System.out.println("Lưu File thất bại");
        }
                
    }
    public static void main(String[] args) {
        testLuuFile();
    }
    
}
