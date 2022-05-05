
package Entidades;

public class VelocidadMedia extends FormulaGeneral{
    private double PF;
    private double PI;
    private double TF;
    private double TI;

    public VelocidadMedia(double PF, double PI, double TF, double TI, double n2, double n3, int expo2, int expo3, int var) {
        super(n2, n3, expo2, expo3, var);
        this.PF = PF;
        this.PI = PI;
        this.TF = TF;
        this.TI = TI;
    }
    
    public double Ves(){
        return (PF-PI)/(TF-TI);
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
    
}
