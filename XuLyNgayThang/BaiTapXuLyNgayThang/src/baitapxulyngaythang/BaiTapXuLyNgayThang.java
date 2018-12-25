/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapxulyngaythang;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class BaiTapXuLyNgayThang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int nam =cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay =cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(" Nam nay la nam :" +nam);
        System.out.println(" thang hien tai la thang "+ (thang+1));
        System.out.println(" ngay hien tai la ngay :"+ ngay);
        Date t =cal.getTime();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("Hom nay :"+sdf.format(t));
    }
    
}
