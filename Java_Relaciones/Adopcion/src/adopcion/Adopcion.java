/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adopcion;

import adopcionEntidad.Mascota;
import adopcionEntidad.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 *
 * @author jpach
 */
public class Adopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Mascota> listaMascota = new ArrayList<>();
        listaMascota.add(new Mascota("Apolo","Pincher",3,20));
        listaMascota.add(new Mascota("Zeus","Pincher",3,25));
        
       List<Persona> listaPersona = new ArrayList<>();
       listaPersona.add(new Persona("Juan","Pacheco",24,1002193737,listaMascota.get(0)));
       listaPersona.add(new Persona("Jonatan","Perez",24,1002193737,listaMascota.get(1)));
       
       
        listaPersona.forEach((x)->System.out.println(x));
       
    }

}
