
package Entidades;

public class VelocidadMedia {
    private double PF;
    private double PI;
    private double TF;
    private double TI;
    private double Ves;

    public VelocidadMedia(double PF, double PI, double TF, double TI, double Ves) {
        this.PF = PF;
        this.PI = PI;
        this.TF = TF;
        this.TI = TI;
        this.Ves = Ves;
    }
    
    public boolean Ves(){
        return Ves==(PF-PI)/(TF-TI);
    }
    
    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
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

    public double getVes() {
        return Ves;
    }

    public void setVes(double Ves) {
        this.Ves = Ves;
    }
    
}
