package Pantallas;

import Entidades.FormulaGeneral;
import java.util.ArrayList;

public class ConsolaPrueba2 {
    static double n1;
    static double n2;
    static double n3;
    static int e1;
    static int e2;
    static int e3;
       
    static ArrayList<FormulaGeneral> listaFormula1 = new ArrayList<>();
     
    static FormulaGeneral control = new FormulaGeneral();

    //====================MAIN=======================
    public static void main(String[] args) {
        getVars();        
        System.out.println("----Formula Principal-----");
        Derivar1(n1, n2, n3, e1, e2, e3);
        setNewVars();
        Derivar1(n1, n2, n3, e1, e2, e3);
    }
    
    public static void getVars() {
        n1 = 40;
        n2 = 50;
        n3 = 10;
        e1 = 1;
        e2 = 3;
        e3 = 4;
    }

    public static void setNewVars() {
        for (FormulaGeneral fg: listaFormula1) {
            n1 = fg.getN1();
            n2 = fg.getN2();
            n3 = fg.getN3();
            e1 = fg.getExpo1();
            e2 = fg.getExpo2();
            e3 = fg.getExpo3();
        }
    }

    public static void Derivar1(double nu1, double nu2, double nu3, int ex1, int ex2, int ex3) {

        listaFormula1.add(new FormulaGeneral(nu1, nu2, nu3, ex1, ex2, ex3));
        for (FormulaGeneral fg : listaFormula1) {
            fg.Derivar();
            System.out.println(fg.ImprimirFormula());
        }
        setNewVars();
        listaFormula1.clear();

        //FormulaGeneral nuevaFormula[] = new FormulaGeneral[listaFormula1.size()];
        //listaFormula1.toArray(nuevaFormula);
    }
}
