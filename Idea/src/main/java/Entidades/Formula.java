
package Entidades;

public class Formula {
    private int Tipo;
    

    public Formula(int Tipo) {
        this.Tipo = Tipo;
    }
    public String tipo(){
        String vec[]={"","DD","DI","II"};
        return vec[Tipo];
    }
    public String Derivar1(int num1, int num2, int num3,  int expo1, int expo2, int expo3){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        num1 = num1 * expo1;  
        num2 = num2 * expo2;
        expo2 = expo2 - 1;
        num3 = num3 * expo3;
        expo3 = expo3 - 1;
        
        
        String phrase1 = (String.valueOf(num1)+" + "+String.valueOf(num2) + "X^" + String.valueOf(expo2)+" + "+String.valueOf(num3) + "X^" + String.valueOf(expo3));
        System.out.println(phrase1);
        return phrase1;
    }
    public String Derivar2(int num1, int num2, int num3,  int expo1, int expo2, int expo3){
        int n=0;
        int n1=0;
        String phrase1 = null;
//gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        n=expo2-1;
        n1=expo3-1;
        num2 = ((num2 * n )*expo2);
        expo2 = expo2 - 2;
        num3 = ((num3 * n1)*expo3);
        expo3 = expo3 - 2;
        
        if(expo2>0 && expo3>0){
            phrase1 = (String.valueOf(num2) + "X^" + String.valueOf(expo2)+" + "+String.valueOf(num3) + "X^" + String.valueOf(expo3));
        }else if(expo2==0){
            phrase1 = (String.valueOf(num2) +" + "+String.valueOf(num3) + "X^" + String.valueOf(expo3));
        }else if(expo3==0){
            phrase1 = (String.valueOf(num2) + "X^" + String.valueOf(expo2)+" + "+String.valueOf(num3));
        }
        return phrase1;
    }
    public void Derivar3(int num3, int expo3){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo3 == 0){
            expo3 = 1;
        }
        
        num3 = num3 * expo3;
        expo3 = expo3 - 1;
        
        String phrase1 = (String.valueOf(num3) + "X^" + String.valueOf(expo3));
        System.out.println(phrase1);
    }
    public void Integral1(int num1, int expo1){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo1 == 0){
            expo1 = 1;
        }
        
        num1 = (num1/expo1) * expo1;
        expo1 = expo1 + 1;
        
        String phrase1 = (String.valueOf(num1) + "X^" + String.valueOf(expo1));
        System.out.println(phrase1);
    }
    public void Integral2(int num2, int expo2){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo2 == 0){
            expo2 = 1;
        }
        
        num2 = (num2/expo2) * expo2;
        expo2 = expo2 + 1;
        
        String phrase1 = (String.valueOf(num2) + "X^" + String.valueOf(expo2));
        System.out.println(phrase1);
    }
    public void Integral3(int num3, int expo3){
        //gn1 , gexpo1 y gx1 son los parametros que ingresan desde afuera
        //Prueba con un solo termino
        //Si no se especific la variable y el exponente, se suponen como 1
        if(expo3 == 0){
            expo3 = 1;
        }
        
        num3 = (num3/expo3) * expo3;
        expo3 = expo3 + 1;
        
        String phrase1 = (String.valueOf(num3) + "X^" + String.valueOf(expo3));
        System.out.println(phrase1);
    }
    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
}
