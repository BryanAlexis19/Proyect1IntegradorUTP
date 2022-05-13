
package Entidades;
import Interfaces.Constantes;

public class VelocidadMedia2 implements Constantes{

    private double PF;
    private double PI;
    private double TF;

    public VelocidadMedia2(double PF, double PI, double TF) {
        this.PF = PF;
        this.PI = PI;
        this.TF = TF;
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
    
    public double calcVelMedia() {
        return (PF-PI) / (TF-TI);
    }
    
    
    
}
