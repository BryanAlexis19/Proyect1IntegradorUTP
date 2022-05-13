
package Entidades;
 
import Interfaces.Constantes;

public class AceleracionMedia implements Constantes {
    
    private double VF;
    private double TF;

    public AceleracionMedia(double VF, double TF) {
        this.VF = VF;

        this.TF = TF;
    }

    public double getTF() {
        return TF;
    }

    public void setTF(double TF) {
        this.TF = TF;
    }

    public double getVF() {
        return VF;
    }

    public void setVF(double VF) {
        this.VF = VF;
    }
    
    public double calcAcelMedia() {
        return (VF-VI) / (TF - TI);
    }
}
