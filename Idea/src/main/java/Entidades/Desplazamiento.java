
package Entidades;

public class Desplazamiento {
    
    private double PF;
    private double PI;
    private double des;
    private double TF;
    private double TI;

    public Desplazamiento(double PF, double PI, double des, double TF, double TI) {
        this.PF = PF;
        this.PI = PI;
        this.des = des;
        this.TF = TF;
        this.TI = TI;
    }

    public boolean Des(){
        return des==PF-PI;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }

    public double getTI() {
        return TI;
    }

    public void setTI(double TI) {
        this.TI = TI;
    }

    public double getTF() {
        return TF;
    }

    public void setTF(double TF) {
        this.TF = TF;
    }
    
}
