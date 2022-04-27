
package Entidades;

public class MRUV {
    private double P;
    private double V;
    private double T;
    private double A;
    private double mruvX;
    private double mruvV;

    public MRUV(double P, double V, double T, double A, double mruvX, double mruvV) {
        this.P = P;
        this.V = V;
        this.T = T;
        this.A = A;
        this.mruvX = mruvX;
        this.mruvV = mruvV;
    }
    
    public double mruvPosicion(){
        return mruvX=P+(V*T)+(1/2)*A*(T*T);
    }
    public double mruvVelocidad(){
        return mruvX=V+A*T;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }

    public double getV() {
        return V;
    }

    public void setV(double V) {
        this.V = V;
    }

    public double getT() {
        return T;
    }

    public void setT(double T) {
        this.T = T;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getMruvX() {
        return mruvX;
    }

    public void setMruvX(double mruvX) {
        this.mruvX = mruvX;
    }

    public double getMruvV() {
        return mruvV;
    }

    public void setMruvV(double mruvV) {
        this.mruvV = mruvV;
    }
    
}
