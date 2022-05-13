
package Entidades;

public class Desplazamiento  {
    
    private double PF;
    private double PI;
    
    public Desplazamiento(double pi, double pf){
        this.PI = pi;
        this.PF = pf;
    }

    public double getPF() {
        return PF;
    }

    public void setPF(double PF) {
        this.PF = PF;
    }
    
    public double getPI(){
        return PI;
    }
    
    public void setPI(double PI) {
        this.PI = PI;
    }
    
    public double calcDesp(){
        return PF-PI;
    }
    
}
