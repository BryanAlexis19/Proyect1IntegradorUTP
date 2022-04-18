
package Entidades;

public class Desplazamiento {
    
    private double PF;
    private int expo1;
    private int expo2;
    private int expo3;
    private double x1;
    private double x2;
    private double x3;
    private double n1;
    private double n2;
    private double n3;
    private double PI;
    private double des;
    private double TF;
    private double TI;

    public Desplazamiento(double PF, int expo1, int expo2, int expo3, double x1, double x2, double x3, double n1, double n2, double n3, double PI, double des, double TF, double TI) {
        this.PF = PF;
        this.expo1 = expo1;
        this.expo2 = expo2;
        this.expo3 = expo3;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.PI = PI;
        this.des = des;
        this.TF = TF;
        this.TI = TI;
    }
    //Dezplasamiento en determinado tiempo seria el tiempo final
    //des() muestra hasta donde se ha movido desde la posicion inicial
    public double des(){
        return des=PF-PI;
    }

    public int getExpo3() {
        return expo3;
    }

    public void setExpo3(int expo3) {
        this.expo3 = expo3;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public int getExpo1() {
        return expo1;
    }

    public void setExpo1(int expo1) {
        this.expo1 = expo1;
    }

    public int getExpo2() {
        return expo2;
    }

    public void setExpo2(int expo2) {
        this.expo2 = expo2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }

    public double getTF() {
        return TF;
    }

    public void setTF(double TF) {
        this.TF = TF;
    }

    public double getTI() {
        return TI;
    }

    public void setTI(double TI) {
        this.TI = TI;
    }
   
}
