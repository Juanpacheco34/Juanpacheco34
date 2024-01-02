/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopcionextra.Entidad;


/**
 * clase Persona con atributos: nombre, apellido, edad, documento y Perro. Ahora
 * deberemos en el main crear dos Personas y dos Perros.
 *
 * @author jpach
 */
public class Persona {

    private String nombre;
    private Mascota mascota;

    public Persona() {
    }

    public Persona(String nombre, Mascota mascota) {
        this.nombre = nombre;
        this.mascota = mascota;
    }
    

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + " " + mascota + '}';
    }



    
}