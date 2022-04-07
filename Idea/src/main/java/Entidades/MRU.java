
package Entidades;

public class MRU {
    private double P1;
    private double P2;
    private double V1;
    private double V2;
    private double T1;
    private double T2;
    private double Mes1;
    private double Mes2;

    public MRU(double P1, double P2, double V1, double V2, double T1, double T2, double Mes1, double Mes2) {
        this.P1 = P1;
        this.P2 = P2;
        this.V1 = V1;
        this.V2 = V2;
        this.T1 = T1;
        this.T2 = T2;
        this.Mes1 = Mes1;
        this.Mes2 = Mes2;
    }

    public double Mes1(){
        return Mes1=P1+V1*T1;
    }
    public double Mes2(){
        return Mes2=P2+V2*T2;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double P2) {
        this.P2 = P2;
    }

    public double getV2() {
        return V2;
    }

    public void setV2(double V2) {
        this.V2 = V2;
    }

    public double getT2() {
        return T2;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double P1) {
        this.P1 = P1;
    }

    public double getV1() {
        return V1;
    }

    public void setV1(double V1) {
        this.V1 = V1;
    }

    public double getT1() {
        return T1;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public double getMes1() {
        return Mes1;
    }

    public void setMes1(double Mes1) {
        this.Mes1 = Mes1;
    }

    public double getMes2() {
        return Mes2;
    }

    public void setMes2(double Mes2) {
        this.Mes2 = Mes2;
    }

}
