/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulydinhdangso;

import java.text.DecimalFormat;

/**
 *
 * @author nguye
 */
public class XuLyDinhDangSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double toan =5;
        double ly =6;
        double hoa =9;
        double dtb =(toan+ ly +hoa)/3;
        DecimalFormat dcf =  new DecimalFormat("#.###");
        System.out.println("diem trung binh "+dcf.format(dtb));
    }
    
}
