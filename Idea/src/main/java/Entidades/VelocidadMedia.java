
package Entidades;
import Interfaces.Constantes;

public class VelocidadMedia implements Constantes{

    private double PF;
    private double PI;
    private double TF;

    public VelocidadMedia(double PF, double PI, double TF) {
        this.PF = PF;
        this.PI = PI;
        this.TF = TF;
    }
    
        public double calcVelMedia() {
        return (PF-PI) / (TF-TI);
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
    
}
