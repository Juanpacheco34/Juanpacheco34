/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletaEntidad;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6.
 *
 * @author jpach
 */
public class Jugador {

    private String nombre;
    private int id;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(boolean mojado) {
        this.mojado = mojado;
    }
    

    public Jugador(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public void disparo(Revolver revol) {
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//  mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//  revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//  devuelve true, sino false.
        System.out.println("El Jugador se esta Apuntando...");
        System.out.println("Apretando gatillo");
        System.out.println("Mojado: " + (this.mojado = revol.mojar()));
        revol.siguienteChorro();

    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre: " + nombre + id + ", mojado: " + mojado + '}';
    }



}
