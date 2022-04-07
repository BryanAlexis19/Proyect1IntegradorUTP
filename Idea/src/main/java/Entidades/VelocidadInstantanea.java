
package Entidades;

public class VelocidadInstantanea {
    private double V /*derivada de posicion*/;
    private double T;

    public VelocidadInstantanea(double V, double T) {
        this.V = V;
        this.T = T;
    }

    public double getT() {
        return T;
    }

    public void setT(double T) {
        this.T = T;
    }

    public double getV() {
        return V;
    }

    public void setV(double V) {
        this.V = V;
    }
    
}
