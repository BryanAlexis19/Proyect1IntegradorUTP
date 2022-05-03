
package Controlador;
import Entidades.*;
import java.util.*;

public class principal{    
    // derivar puede recibir un array como tambien valores en crudo
    public String Derivar(int n1, int expo1) {
        String N;
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo1 ==  0){
            expo1 = 1;
        }               
        
        //DERIVAR
        n1 = n1 * expo1;
        expo1 = expo1 - 1;      
        
        String phrase1 = (String.valueOf(n1) + "X^" + String.valueOf(expo1));      
        System.out.println( phrase1 );
       return N=phrase1;
    }
    /*public double Derivar2(int n2, int expo2) {
        
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo2 ==  0){
            expo2 = 1;
        }               
        
        //DERIVAR   
        n2 = n2 * expo2;
        expo2 = expo2 - 1;
        
        String phrase2 = (String.valueOf(n2) + "X^" + String.valueOf(expo2));
        
        System.out.println(phrase2);
        
    }
    public double Derivar3(int n3,int expo3) {
        
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo3 ==  0){
            expo3 = 1;
        }               
        
        //DERIVAR
        
        n3 = n3 * expo3;
        expo3 = expo3 - 1; 
        
        
        String phrase1 = (String.valueOf(n1) + "X^" + String.valueOf(expo1));
        String phrase2 = (String.valueOf(n2) + "X^" + String.valueOf(expo2));
        String phrase3 = (String.valueOf(n3) + "X^" + String.valueOf(expo3));
        
        System.out.println("(" + phrase1 + ") (" + phrase2 + ") (" + phrase3 + ")");
        
    }*/
    
    
    
    //uSUARIO INGRESA FORMULA
    // DERIVAR
    // NETBEANS > CALL DERIVAR(PRIMERA FORMULA) = SEGUNDA FORMULA
    // NETBEANS > CALL DERIVAR (SEGUNDA FORMULA) = TERCERA FORMULA
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void Integrar (int n1, int n2, int n3, int expo1, int expo2, int expo3) {
        //integral
        n1 = (n1/expo1) + expo1;
        expo1 = expo1 + 1;
    }
    
    public void VerificarTiempoIngresado () {
        
        
    }
    
}
