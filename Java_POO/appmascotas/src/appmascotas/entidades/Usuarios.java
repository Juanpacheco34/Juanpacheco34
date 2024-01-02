package appmascotas.entidades;

import java.util.Date;

/**
 *
 * @author jpach
 */
public class Usuarios {

    private String nombre;
    private String apellido;
    private Date f_nacimiento;
    private String pais;

        //Constructor con Argumentos o parametros
    public Usuarios(String nombre, String apellido, Date f_nacimiento, String pais) {
        //Referenciar los atributos argumentados en el constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.f_nacimiento = f_nacimiento;
        this.pais = pais;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", f_nacimiento=" + f_nacimiento + ", pais=" + pais + '}';
    }
    
    

}
