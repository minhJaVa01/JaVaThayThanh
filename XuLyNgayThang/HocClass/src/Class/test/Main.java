/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.test;

import Class.model.KhachHang;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args){
        KhachHang Teo = new KhachHang("nv01","manh",23,"YenBai");
        System.out.println("Tui chi muon lay dia chi " + Teo.getDiaChi());
    }
    
}
