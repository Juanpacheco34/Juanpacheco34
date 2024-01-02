/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEntidades;


/**
 *
 * @author jpach
 */
public class Usuario {

    private String nombre;
    private Dni dni;

    
    
    public Usuario(String nombre,Dni dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni" + dni + '}';
    }


    
    
}
