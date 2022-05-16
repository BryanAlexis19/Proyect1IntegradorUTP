
package Entidades;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JTextArea;
public class FormulaGeneral {
    //DECLARAR LAS VARIABLES DE LA CLASE
    //Termino independiente de la formula
    private double n1;
    private double n2;
    private double n3;
    //Exponente de la formula
    private int expo1;
    private int expo2;
    private int expo3;
    //Variable (X) de la formula
    private int var;
    
    //Constructor vacio
    public FormulaGeneral (){        
    }
   //Constructor recargado con variable de tiempo
    public FormulaGeneral(double n1, double n2, double n3, int expo1, int expo2, int expo3, int var) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.expo1 = expo1;
        this.expo2 = expo2;
        this.expo3 = expo3;
        this.var =var;
    }
    //Constructor recargado SIN VARIABLE DE TIEMPO
   public FormulaGeneral(double n1, double n2, double n3, int expo1, int expo2, int expo3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.expo1 = expo1;
        this.expo2 = expo2;
        this.expo3 = expo3;
    }
     //Constructor recargado SIN VARIABLE DE TIEMPO
    //Constructor recargado sin variable de tiempo ni primeras varibles
    public FormulaGeneral(double n2, double n3,int expo2, int expo3) {
        this.n2 = n2;
        this.n3 = n3;
        this.expo2 = expo2;
        this.expo3 = expo3;
    }
    //Constructor recargado con variable de tiempo ni primeras varibles
    public FormulaGeneral(double n2, double n3,int expo2, int expo3, int var) {
        this.n2 = n2;
        this.n3 = n3;
        this.expo2 = expo2;
        this.expo3 = expo3;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public int getExpo1() {
        return expo1;
    }

    public void setExpo1(int expo1) {
        this.expo1 = expo1;
    }

    public int getExpo2() {
        return expo2;
    }

    public void setExpo2(int expo2) {
        this.expo2 = expo2;
    }

    public int getExpo3() {
        return expo3;
    }

    public void setExpo3(int expo3) {
        this.expo3 = expo3;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }
    
    public void formatNumber(){
        
    }
    
    public String ImprimirFormula() {
        if(n1==0 && expo2>0 && expo3>0 ){
        return fto(n2) + "X^" + expo2 + " + " +  fto(n3) + "X^" + expo3;
        }else if(n2==0){
        return fto(n1) +" + " + fto(n3) + "X^" + expo3;
        }else if(n3==0){
        return fto(n1) +" + " + fto(n2) + "X^" + expo2;
        }else if(n2==0 && n1==0){
        return fto(n3) + "X^" + expo3;
        }else if(n3==0 && n1==0){
        return fto(n2) + "X^" + expo2;
        }else if(expo2==0){
        return fto(n2) +" + "+ fto(n3) + "X^" + expo3;
        }else if(expo3==0){
        return fto(n2)  + "X^" + expo2 +" + "+ fto(n3);
        }else if(expo2==0 && expo3==0){
        return fto(n2) +" + "+ fto(n3);
        }else if(n2==0 && expo2==0){
        return fto(n3) + "X^" + expo3 ;
        }else if(n3==0 && expo3==0){
        return fto(n2) + "X^" +expo2;
        }else
        return fto(n1) +" + " + fto(n2) + "X^" + expo2 + " + " +  fto(n3) + "X^" + expo3;
    }
    
    public String ImprimirFormula1() {
        return fto(n2) + "X^" + expo2 + " + " +  fto(n3) + "X^" + expo3;
    }

    public void Derivar(){        
        expo1 = expo1 - 1;
        n2 = n2 * expo2;
        expo2 = expo2 - 1;
        n3 = n3 * expo3;
        expo3 = expo3 - 1;
    }
    
    public void Derivar2(){
        n2 = n2 * expo2;
        expo2 = expo2 - 1;
        n3 = n3 * expo3;
        expo3 = expo3 - 1;
    }
    
    public void Integral(){
        expo2 = expo2 + 1;
        n2 = n2 / expo2;
        expo3 = expo3 + 1;
        n3 = n3 / expo3;
    }
        
    public double OperarT() {
        double resT;        
        resT = n1 + (n2 * Math.pow(var, expo2)) + (n3 * Math.pow(var, expo3));        
        return resT;
    }
    
    public String fto(double param){
        DecimalFormat format1 = new DecimalFormat("0.00");
        DecimalFormat format2 = new DecimalFormat("#");
        String rpta;
        
        if(param - Math.floor(param)==0){
            rpta = format2.format(param);
        }else{
            if(param<1){
                rpta = format1.format(param);
            }else{
                rpta = format2.format(param);
            }
        }
        return rpta;
    }
    
    public void ProcedimientoP(int Tipo,JTextArea ar){
        double r=0;
        double r2=0;
        double N=0;
        double N2=0;
        double NE=0;
        double NE2=0;
        int T=var;
        if(Tipo==1){
            ar.append("\n---PROCEDIMIENTO(P/T)-------------------------------");
            ar.append("\n "+n1+" + "+n2+" * "+" ("+T+")^ "+expo2+" + "+n3+" * "+" ("+T+")^ "+expo3);
            N=n2*Math.pow(T, expo2);
            N2=n3*Math.pow(T, expo3);
            ar.append("\n "+n1+" + "+N+" + "+N2);
            ar.append("\n----------------------------------------------------");
            ar.append("\n--------DESPLAZAMIENTO------------------------------");
            ar.append("\n ("+n1+" + "+n2+" * "+" ("+T+")^ "+expo2+" + "+n3+" * "+" ("+T+")^ "+expo3+")"+" - "+n1+" + "+n2+" * "+" ("+0+")^ "+expo2+" + "+n3+" * "+" ("+0+")^ "+expo3);
            ar.append("\n ("+n1+" + "+N+" + "+N2+")"+" - "+n1);
            r=n1+N+N2;
            ar.append("\n ("+r+")"+" - "+n1);
            ar.append("\n----------------------------------------------------");
            ar.append("\n---PROCEDIMIENTO(Derivada)---------------------------------");
            ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            N=n2*expo2;
            NE=expo2-1;
            N2=n3*expo3;
            NE2=expo3-1;
            ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
            ar.append("\n----------------------------------------------------");
        }
        else if(Tipo==2){
            ar.append("\n---PROCEDIMIENTO(Derivada)---------------------------------");
            ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            N=n2*expo2;
            NE=expo2-1;
            N2=n3*expo3;
            NE2=expo3-1;
            ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
            ar.append("\n----------------------------------------------------");
            if(T>0){//errores esta bien pero a la vez mal haha
            ar.append("\n---PROCEDIMIENTO(V/T)-------------------------------");
            ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            ar.append("\n "+N+" * "+ T +" ^"+NE+" + "+N2+" * "+ T +" ^"+NE2);
            r=Math.pow(T, NE);
            r2=Math.pow(T, NE2);
            ar.append("\n "+N+" * "+ r +" + "+N2+" * "+r2);
            ar.append("\n----------------------------------------------------");
            }
        }else if(Tipo==3){
            ar.append("\n---PROCEDIMIENTO--------------------------------------");
            ar.append("\n "+r+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            N=n2*expo2;
            NE=expo2-1;
            N2=n3*expo3;
            NE2=expo3-1;
            ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
            ar.append("\n-------------------------------------------------------");
        }
    }
        public void ProcedimientoV(int Tipo,JTextArea ar){
            double r=0;
            double r2=0;
            double N=0;
            double N2=0;
            double NE=0;
            double NE2=0;
            int T=var;
            if(Tipo==1){
                ar.append("\n---PROCEDIMIENTO(P/T)-------------------------------");
                ar.append("\n "+n1+" + "+n2+" * "+" ("+T+")^ "+expo2+" + "+n3+" * "+" ("+T+")^ "+expo3);
                N=n2*Math.pow(T, expo2);
                N2=n3*Math.pow(T, expo3);
                ar.append("\n "+n1+" + "+N+" + "+N2);
                ar.append("\n----------------------------------------------------");
                ar.append("\n--------DESPLAZAMIENTO------------------------------");
                ar.append("\n ("+n1+" + "+n2+" * "+" ("+T+")^ "+expo2+" + "+n3+" * "+" ("+T+")^ "+expo3+")"+" - "+n1+" + "+n2+" * "+" ("+0+")^ "+expo2+" + "+n3+" * "+" ("+0+")^ "+expo3);
                ar.append("\n ("+n1+" + "+N+" + "+N2+")"+" - "+n1);
                r=n1+N+N2;
                ar.append("\n ("+r+")"+" - "+n1);
                ar.append("\n----------------------------------------------------");
                ar.append("\n---PROCEDIMIENTO(Derivada)---------------------------------");
                ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
                N=n2*expo2;
                NE=expo2-1;
                N2=n3*expo3;
                NE2=expo3-1;
                ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
                ar.append("\n----------------------------------------------------");
            }
            else if(Tipo==2){
                ar.append("\n---PROCEDIMIENTO(Derivada)---------------------------------");
                ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
                N=n2*expo2;
                NE=expo2-1;
                N2=n3*expo3;
                NE2=expo3-1;
                ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
                ar.append("\n----------------------------------------------------");
                if(T>0){//errores esta bien pero a la vez mal haha
                ar.append("\n---PROCEDIMIENTO(V/T)-------------------------------");
                ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
                ar.append("\n "+N+" * "+ T +" ^"+NE+" + "+N2+" * "+ T +" ^"+NE2);
                r=Math.pow(T, NE);
                r2=Math.pow(T, NE2);
                ar.append("\n "+N+" * "+ r +" + "+N2+" * "+r2);
                ar.append("\n----------------------------------------------------");
                }
            }else if(Tipo==3){
                ar.append("\n---PROCEDIMIENTO--------------------------------------");
                ar.append("\n "+r+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
                N=n2*expo2;
                NE=expo2-1;
                N2=n3*expo3;
                NE2=expo3-1;
                ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
                ar.append("\n-------------------------------------------------------");
            }
        }
        public void ProcedimientoA(int Tipo,JTextArea ar){
        double r=0;
        double r2=0;
        double N=0;
        double N2=0;
        double NE=0;
        double NE2=0;
        int T=var;
        if(Tipo==1){
            ar.append("\n---PROCEDIMIENTO(P/T)-------------------------------");
            ar.append("\n "+n1+" + "+n2+" * "+" ("+T+")^ "+expo2+" + "+n3+" * "+" ("+T+")^ "+expo3);
            N=n2*Math.pow(T, expo2);
            N2=n3*Math.pow(T, expo3);
            ar.append("\n "+n1+" + "+N+" + "+N2);
            ar.append("\n----------------------------------------------------");
            ar.append("\n--------DESPLAZAMIENTO------------------------------");
            ar.append("\n ("+n1+" + "+n2+" * "+" ("+T+")^ "+expo2+" + "+n3+" * "+" ("+T+")^ "+expo3+")"+" - "+n1+" + "+n2+" * "+" ("+0+")^ "+expo2+" + "+n3+" * "+" ("+0+")^ "+expo3);
            ar.append("\n ("+n1+" + "+N+" + "+N2+")"+" - "+n1);
            r=n1+N+N2;
            ar.append("\n ("+r+")"+" - "+n1);
            ar.append("\n----------------------------------------------------");
            ar.append("\n---PROCEDIMIENTO(Derivada)---------------------------------");
            ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            N=n2*expo2;
            NE=expo2-1;
            N2=n3*expo3;
            NE2=expo3-1;
            ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
            ar.append("\n----------------------------------------------------");
        }
        else if(Tipo==2){
            ar.append("\n---PROCEDIMIENTO(Derivada)---------------------------------");
            ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            N=n2*expo2;
            NE=expo2-1;
            N2=n3*expo3;
            NE2=expo3-1;
            ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
            ar.append("\n----------------------------------------------------");
            if(T>0){//errores esta bien pero a la vez mal haha
            ar.append("\n---PROCEDIMIENTO(V/T)-------------------------------");
            ar.append("\n "+n1+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            ar.append("\n "+N+" * "+ T +" ^"+NE+" + "+N2+" * "+ T +" ^"+NE2);
            r=Math.pow(T, NE);
            r2=Math.pow(T, NE2);
            ar.append("\n "+N+" * "+ r +" + "+N2+" * "+r2);
            ar.append("\n----------------------------------------------------");
            }
        }else if(Tipo==3){
            ar.append("\n---PROCEDIMIENTO--------------------------------------");
            ar.append("\n "+r+" * "+0+" + ("+n2+" * "+expo2+") X^"+expo2+" - "+1+" + ("+n3+" * "+expo3+") X^"+expo3+" - "+1);
            N=n2*expo2;
            NE=expo2-1;
            N2=n3*expo3;
            NE2=expo3-1;
            ar.append("\n "+N+" X^"+NE+" + "+N2+" X^"+NE2);
            ar.append("\n-------------------------------------------------------");
        }
        
    }
}
