/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineEntidades;

/**
 * espectador, nos interesa saber su nombre, edad y el dinero que tiene
 * disponible.
 *
 * @author jpach
 */
public class Espectador {

    private final String[] nombreAl = {"Juan", "Jonatan", "Elias", "Ana", "Debora"};
    private String nombre;
    private int edad;
    private int dinero;

    public Espectador() {
    }

    public Espectador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    


    public String[] getNombreAl() {
        return nombreAl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }

}
