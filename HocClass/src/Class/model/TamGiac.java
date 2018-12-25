/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.model;

/**
 *
 * @author nguye
 */
public class TamGiac {

    private int canhA;
    private int canhB;
    private int canhC;

    public TamGiac() {
    }

    public TamGiac(int canhA, int canhB, int canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }

    @Override
    public String toString() {
        String s= "TamGiac{" + "canhA=" + canhA + ", canhB=" + canhB + ", canhC=" + canhC + '}';
       if(kiemTraHopLe() ==false){
           return s + "tam giac khong dung";
       }
       else{
           return s +"\nChu vi ="+chuVi() +"; Dien tich = "+ dienTich();
       }
    }
    /**
     * hàm kiemTraHopLe() là hỗ trợ thông tin cho SERVICE MOTHOD 
     * public là service method toString()
     * @return 
     */
    private boolean kiemTraHopLe() {
        boolean kt = this.canhA > 0 && this.canhB > 0 && this.canhC > 0
                && ((this.canhA + this.canhB) > this.canhC)
                && ((this.canhB + this.canhC) > this.canhA)
                && ((this.canhC + this.canhA) > this.canhB);
        return kt;
    }
    public double chuVi(){
        return this.canhA +this.canhB +this.canhC;
    }
    public double dienTich(){
        double p =chuVi()/2;
        double dt =Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
        return dt;
    }
    

}
