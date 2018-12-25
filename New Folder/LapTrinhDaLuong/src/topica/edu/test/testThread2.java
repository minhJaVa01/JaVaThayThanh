/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.edu.test;

import topica.edu.vn.MyThread2;

/**
 *
 * @author nguye
 */
public class testThread2 {
    public static void main(String[] args) {
        Thread th3 = new Thread( new MyThread2());
        th3.setName("tien trinh 3");
        th3.start();
        Thread th4 = new Thread(new MyThread2());
        th4.setName("Tien trinh 4");
        th4.start();
    }
    
}
