/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.ecu.vn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import topica.ecu.vn.model.KhachHang;

/**
 *
 * @author nguye
 */
public class TextFileFactory {

    public static boolean luuFile(ArrayList<KhachHang> dsKH, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for (KhachHang kh : dsKH) {
                String line = kh.getMa() + " ;" + kh.getTen();
                bw.write(line);
                bw.newLine();
            }
            fos.close();
            osw.close();
            bw.close();
            return true;
        } catch (IOException e) {
        }
        return false;
    }
    public static ArrayList<KhachHang>docFile(String path){
        ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
        try {
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            while(line!=null){
                String []arr =line.split(";");
                if (arr.length ==2) {
                    KhachHang kh = new KhachHang(arr[0],arr[1]);
                    dsKH.add(kh);
                }
                line=br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
        }
        return dsKH;
    }

}
