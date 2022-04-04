
package Formula;

public class Aceleración {
    private double Vi;
    private double VF;
    private double D;
    private int T;

    public Aceleración(double Vi, double VF, double D, int T) {
        this.Vi = Vi;
        this.VF = VF;
        this.D = D;
        this.T = T;
    }

    public int getT() {
        return T;
    }

    public void setT(int T) {
        this.T = T;
    }

    public double getVi() {
        return Vi;
    }

    public void setVi(double Vi) {
        this.Vi = Vi;
    }

    public double getVF() {
        return VF;
    }

    public void setVF(double VF) {
        this.VF = VF;
    }

    public double getD() {
        return D;
    }

    public void setD(double D) {
        this.D = D;
    }
    
}
