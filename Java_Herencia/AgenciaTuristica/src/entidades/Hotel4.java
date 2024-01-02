/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * * Hotel **** Gimnasio, Nombre del Restaurante, Capacidad del Restaurante.
 *
 * @author jpach
 */
public class Hotel4 extends Hotel {

    public Hotel4() {
    }

    public Hotel4(int cantHabitaciones, int numCamas, int cantpisos, String nomRestaurante, String gimnasio, double precioHabitaciones, int capRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantpisos, nomRestaurante, gimnasio, precioHabitaciones, capRestaurante, nombre, direccion, localidad, gerente);
    }

    public void crearHotel4() {
        crearHotel();
    }

    @Override
    public String toString() {
       return "Ubicacion{" + "nombre: " + nombre +  " / direccion: " + direccion +  " / localidad: " + localidad +  " / gerente: " + gerente 
               + "\nHotel4 " +  " / cantHabitaciones: " + cantHabitaciones + " / numCamas: " + numCamas + " / cantpisos: " + cantpisos 
               + " / gimnasio: " + gimnasio + " / nomRestaurante: " + nomRestaurante + " / precioHabitaciones: " + precioHabitaciones 
               + " / capRestaurante: " + capRestaurante + "\n" ;
    }
    
    

}
