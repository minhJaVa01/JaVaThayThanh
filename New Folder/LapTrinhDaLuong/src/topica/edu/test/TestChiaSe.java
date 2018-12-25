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
public class TestChiaSe {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread th1 = new Thread(mt);
        th1.setName("tt1");
        Thread th2 = new Thread(mt);
        th2.setName("tt2");
        Thread th3 = new Thread(mt);
        th3.setName("TT3");
        th2.start();
        th1.start();
        th3.start();
        System.out.println(mt.getX());
    }
}
