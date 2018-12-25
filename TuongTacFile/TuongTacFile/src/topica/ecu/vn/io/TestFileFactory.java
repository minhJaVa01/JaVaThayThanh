/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.ecu.vn.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import topica.ecu.vn.model.KhachHang;

/**
 *
 * @author nguye
 */
public class TestFileFactory {
    public static boolean luuFile(ArrayList<KhachHang> dsKH,String path){
        try {
            FileOutputStream fos  = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            for (KhachHang kh : dsKH) {
                String line = kh.getMa() +" ;" +kh.getTen();
                bw.write(line);
                bw.newLine();
            }
            fos.close();
            osw.close();
            bw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;  
    }
    
}
