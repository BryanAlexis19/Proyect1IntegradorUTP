
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
    
    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
}
