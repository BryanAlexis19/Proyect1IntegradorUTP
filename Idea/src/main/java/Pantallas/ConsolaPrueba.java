
package Pantallas;
import Entidades.VelocidadInstantaneaPrueba;
import java.util.Scanner;
public class ConsolaPrueba {

    public static void main(String[] args) {
       
        double num1;
        double x1;
        int expon1;
        
        
        num1 = 27;
        x1 = 1;
        expon1 = 4;
        
        VelocidadInstantaneaPrueba velprueba = new VelocidadInstantaneaPrueba(num1, x1, expon1);
        velprueba.DerivarDesplazamiento();
        VelocidadInstantaneaPrueba velprueba2 = new VelocidadInstantaneaPrueba(num1, x1, expon1);
        velprueba2.IntegralDesplazamiento();
        
        
    }
    
}
