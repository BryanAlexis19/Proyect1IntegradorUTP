
package Entidades;

public class AceleracionInstantanea {
    private double A/*derivada de velocidad*/;
    private double T;

    public AceleracionInstantanea(double A, double T) {
        this.A = A;
        this.T = T;
    }

    public double getT() {
        return T;
    }

    public void setT(double T) {
        this.T = T;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }
    
}
