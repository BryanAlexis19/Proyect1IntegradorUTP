
package Entidades;

public class Desplazamiento extends FormulaGeneral{
    private int TF;
    private int TI=0;
    private double PF;
    private double PI;
    //Dezplasamiento en determinado tiempo seria el tiempo final
    //des() muestra hasta donde se ha movido desde la posicion inicial

    public Desplazamiento(int TF, int TI, double n1, double n2, double n3, int expo1, int expo2, int expo3, int var) {
        super(n1, n2, n3, expo1, expo2, expo3, var);
        this.TF = TF;
        this.TI = TI;
    }
    
    public double des(){
        return PF-PI;
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

    public int getTF() {
        return TF;
    }

    public void setTF(int TF) {
        this.TF = TF;
    }

    public int getTI() {
        return TI;
    }

    public void setTI(int TI) {
        this.TI = TI;
    }
}
