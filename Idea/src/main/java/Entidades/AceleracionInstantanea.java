
package Entidades;

public class AceleracionInstantanea {
    private double A/*derivada de velocidad*/;
    private int expo1;
    private int expo2;
    private int expo3;
    private double x1;
    private double x2;
    private double x3;
    private double n1;
    private double n2;
    private double n3;
    private double T;

    public AceleracionInstantanea(double A, int expo1, int expo2, int expo3, double x1, double x2, double x3, double n1, double n2, double n3, double T) {
        this.A = A;
        this.expo1 = expo1;
        this.expo2 = expo2;
        this.expo3 = expo3;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.T = T;
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

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
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

    public double getT() {
        return T;
    }

    public void setT(double T) {
        this.T = T;
    }

}
