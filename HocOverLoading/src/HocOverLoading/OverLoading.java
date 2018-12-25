/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocOverLoading;

/**
 *
 * @author nguye
 */
public class OverLoading {
    /**
     * ovareloading là 1-trong cùng 1 lớp có các hàm giống hệt nhau về tên khác nhau về signature
     *                  Signature là gì ?
     *                 1- Số lượng đối số khác nhau
     *                 2- kiểu trả về không phải là 1 signature 
     *                 3- Kiểu dữ liệu các đối số khác nhau 
     * @return 
     */
    public static int fn(int x,int y){
        return x+y;
    }
    public static double fn (double x ,double y){
        return x +y+100;
    }
    
    public static int fn2(int x,int y,int z){
        return x + y +x;
    }
    public  static int fn2(int x){
        return x;
    }
    /**
     * 
     * @param args 
     */
//    public static int fn3(int x,int y){
//        return x +y;
//    }
//    public static double fn3( int x , int y){
//        return x+y;
//    }
    /**
     *OVERLOADING nag cao fn4() số lượng các đối số khác nhau
    
     bản chất là mảng 1 chiều linh động
     * @param arr
     * @return 
     */
    public static int fn4(int ...arr){
        int sum =0;
        for(int x :arr)
            sum+=x;
        return sum;
    }
   
    public static void main(String[] args){
        System.out.println(fn4(1,2,3,4,5));
    }
    
}
