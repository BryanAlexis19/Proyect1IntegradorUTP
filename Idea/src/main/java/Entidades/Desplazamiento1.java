
package Entidades;

public class Desplazamiento1  {
    
    private double PF;
    private double PI;
    
    public Desplazamiento1(double pi, double pf){
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
