package alumnosClass;

import java.util.ArrayList;

/**
 *Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 * @author jpach
 */
public class alumnosClass {
    private String nombre;
    private int n1,n2,n3;
    
    
    
    public alumnosClass(){
        
    }
    
    public alumnosClass(String nombre, int n1, int n2, int n3){
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "alumnosClass{" + "nombre: " + nombre + ", n1: " + n1 + ", n2: " + n2 + ", n3: " + n3 + '}';
    }
    
    
    
    
    
    
    
}
