package ahorcadoClass;

/**
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la 
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos 
con los parámetros que sean necesarios: 
 Constructores, tanto el vacío como el parametrizado. 

 * @author jpach
 */
public class ahorcadoClass {
    private String[] buscar,guardar;
    private int intentos,encontradas;
    
    //Constructores
    public ahorcadoClass(){
        
    }
    
    public ahorcadoClass(String[] buscar,String[] guardar,int intentos, int encontradas){
        this.buscar = buscar;
        this.guardar = guardar;
        this.intentos = intentos;
        this.encontradas = encontradas;
    }

    //Set y Get
    
    
    public String[] getBuscar(){
        return buscar;
    }
    
    public void setBuscar(String[] buscar){
        
    }
    
    public String[] getGuardar() {
        return guardar;
    }

    public void setGuardar(String[] guardar) {
        this.guardar = guardar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
    
    
}
