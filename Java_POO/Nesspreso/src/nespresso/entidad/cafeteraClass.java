package nespresso.entidad;

/**
 * @author jpach
 */
public class cafeteraClass {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public cafeteraClass(){
        
    }
    public cafeteraClass(int capacidadMaxima, int cantidadActual){
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
        
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public int getCantidadActual(){
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "cafeteraClass{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
    
}
