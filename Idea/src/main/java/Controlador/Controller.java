
package Controlador;
import java.util.*;
import Entidades.FormulaGeneral;
public class Controller {
    
    
    public Controller() {
       
    }
    
    ArrayList <FormulaGeneral> listaFormula1 = new ArrayList<>();

    public ArrayList<FormulaGeneral> getListaFormula1() {
        return listaFormula1;
    }

    public void setListaFormula1(ArrayList<FormulaGeneral> listaFormula1) {
        this.listaFormula1 = listaFormula1;
    }

 
    
    
    //DEMO ARRAY (ARREGLO)
    public void arrayTest() {
         // Crear un Array de tamanio fijo
         FormulaGeneral arrayFormula[] = new FormulaGeneral[4];    
         arrayFormula[0] = new FormulaGeneral(2, 3, 4, 1, 2, 3);
         arrayFormula[1] = new FormulaGeneral(2, 3, 4, 1, 2, 3);
         arrayFormula[2] = new FormulaGeneral(2, 3, 4, 1, 2, 3);
         arrayFormula[3] = new FormulaGeneral(2, 3, 4, 1, 2, 3);                                             
         
         System.out.println("=========Prueba Array solo================");
         System.out.println("==========for convencional============");
         for(int i = 0; i<arrayFormula.length; i++){
             System.out.println(arrayFormula[i].ImprimirFormula());
         }
         
         System.out.println("=======forEach=======");
         
         for(FormulaGeneral formu : arrayFormula) {
             System.out.println(formu.ImprimirFormula());
         }
        
    }
    
    public void listTest() {
        System.out.println("");
        System.out.println("=========Prueba ArrayList================");
        //Instanciar el Arraylist del modelo Formula General
        ArrayList <FormulaGeneral> arrayListFormula = new ArrayList<>();
        
        arrayListFormula.add(new FormulaGeneral(5,14, 4, 1, 3, 4));
        arrayListFormula.add(new FormulaGeneral(15,5, 12, 1, 6, 7));
       
        
        
        System.out.println("==========for convencional============");
        for(int i = 0; i<arrayListFormula.size(); i++){
             System.out.println(arrayListFormula.get(i).ImprimirFormula());
         }
        
        System.out.println("=======forEach=======");
        for (FormulaGeneral fg : arrayListFormula) {
            System.out.println(fg.ImprimirFormula());
        }
        
        //Cambiar un elemento en una posicion especifica con ".set"
         arrayListFormula.set(1, new FormulaGeneral(19,50, 40, 1, 9, 6));
         System.out.println("Array cambiado> " + arrayListFormula.get(1).ImprimirFormula());
         
         System.out.println("");
         System.out.println("=====================ARRAY PASADO CON TO.STRING DESDE LIST=================");
        //Pasar a un array antiguo un ArrayList con el metodo toArray
        //Crear array con el tamanio de la lista
        FormulaGeneral arrayPasado[] = new FormulaGeneral[arrayListFormula.size()];
        //Mover la lista al array con toArray
        arrayListFormula.toArray(arrayPasado);
        //Imprimir for convencional
        for (int i = 0; i<arrayPasado.length;i++){
            System.out.println(arrayPasado[i].ImprimirFormula());
        }
        
        //PROBANDO EL ITERADOR (ITERATOR E)
       System.out.println("");
       System.out.println("=====================IMPRIMIENDO DESDE ITERATOR=================");
       //Instaciar iterador de la clase FormulaGeneral
       Iterator <FormulaGeneral> miIteradorFormula = arrayListFormula.iterator();
       //Imprimir mientras haya elementos en el iterador
       while(miIteradorFormula.hasNext()){
           System.out.println(miIteradorFormula.next().getN1());
       }
        
    }
    
}
