
package Entidades;

public class AceleraciónMedia {
    private double VI;
    private double VF;
    private double Aes;
    private double TI;
    private double TF;

    public AceleraciónMedia(double VI, double VF, double Aes, double TI, double TF) {
        this.VI = VI;
        this.VF = VF;
        this.Aes = Aes;
        this.TI = TI;
        this.TF = TF;
    }

    public boolean Aes(){
        return Aes==(VF-VI)/(TF-TI);
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

    public double getVI() {
        return VI;
    }

    public void setVI(double VI) {
        this.VI = VI;
    }

    public double getVF() {
        return VF;
    }

    public void setVF(double VF) {
        this.VF = VF;
    }

    public double getAes() {
        return Aes;
    }

    public void setAes(double Aes) {
        this.Aes = Aes;
    }
    
}
