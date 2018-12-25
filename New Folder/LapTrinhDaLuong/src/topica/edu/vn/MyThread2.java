/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topica.edu.vn;

/**
 *
 * @author nguye
 */
public class MyThread2 implements Runnable{

    private int x =0;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ", i= " +i +"\n\tx="+ x++);
        }
    }
    public int getX(){
        return this.x; 
    }
   
    
}
