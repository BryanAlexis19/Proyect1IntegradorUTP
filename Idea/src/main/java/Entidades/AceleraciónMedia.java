
package Entidades;

public class AceleraciónMedia extends FormulaGeneral{
    private double VI;
    private double VF;
    private double TI=0;
    private double TF;

    public AceleraciónMedia(double VI, double VF, double TI, double TF, double n1, double n2, double n3, int expo1, int expo2, int expo3, int var) {
        super(n1, n2, n3, expo1, expo2, expo3, var);
        this.VI = VI;
        this.VF = VF;
        this.TI = TI;
        this.TF = TF;
    }


    public double Aes(){
        return (VF-VI)/(TF-TI);
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
