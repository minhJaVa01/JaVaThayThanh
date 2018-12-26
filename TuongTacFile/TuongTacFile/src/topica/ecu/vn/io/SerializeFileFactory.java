/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.ecu.vn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import topica.ecu.vn.model.KhachHang;

/**
 *
 * @author nguye
 */
public class SerializeFileFactory {
    public static boolean luuFile(ArrayList<KhachHang>dsKH,String path){
        try {
            FileOutputStream fis = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(dsKH);
            oos.close();fis.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<KhachHang> docFile(String path){
        ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            dsKH =(ArrayList<KhachHang>) data;
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsKH;
    }
    
}
