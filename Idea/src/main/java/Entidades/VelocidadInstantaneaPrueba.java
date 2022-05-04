
package Entidades;

public class VelocidadInstantaneaPrueba {
    
    private double num1;
    private double varx1;
    private int expo1;

    public VelocidadInstantaneaPrueba(double num1, double varx1, int expo1) {
        this.num1 = num1;
        this.varx1 = varx1;
        this.expo1 = expo1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getVarx1() {
        return varx1;
    }

    public void setVarx1(double varx1) {
        this.varx1 = varx1;
    }

    public int getExpo1() {
        return expo1;
    }

    public void setExpo1(int expo1) {
        this.expo1 = expo1;
    }
    
        public void DerivarDesplazamiento(){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo1 == 0){
            expo1 = 1;
        }
        
        if(varx1 == 0){
            varx1 = 1;
        }
        
        
        num1 = num1 * expo1;
        expo1 = expo1 - 1;
        
        String phrase1 = (String.valueOf(num1) + "X^" + String.valueOf(expo1));
        System.out.println(phrase1);
    }
        public void IntegralDesplazamiento(){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo1 == 0){
            expo1 = 1;
        }
        
        if(varx1 == 0){
            varx1 = 1;
        }
        expo1 = expo1 + 1;
        num1 = num1/ expo1;
        
        String phrase1 = (String.valueOf(num1) + "X^" + String.valueOf(expo1));
        System.out.println(phrase1);
    }
}