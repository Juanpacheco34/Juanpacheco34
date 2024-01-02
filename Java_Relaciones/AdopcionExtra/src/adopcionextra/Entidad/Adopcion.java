/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adopcionextra.Entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro
 * programa va a tener que contar con muchas personas y muchos perros.
 *
 * El programa deberá preguntarle a cada persona, que perro según su nombre,
 * quiere adoptar. Dos personas no pueden adoptar al mismo perro, si la persona
 * eligió un perro que ya estaba adoptado, se le debe informar a la persona. Una
 * vez que la Persona elige el Perro se le asigna, al final deberemos mostrar
 * todas las personas con sus respectivos perros.
 *
 * @author jpach
 */
public class Adopcion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Mascota> listaPerros = new ArrayList();
    List<Persona> listaPersonas = new ArrayList();
    List<Persona> adopciones = new ArrayList();

    public void insertarManu() {
        System.out.print("Ingrese su nombre para el registro: ");
        String nom = leer.next().toUpperCase();

        listaPersonas.add(new Persona(nom));
        System.out.println("Registro Exitoso\n\n");

    }

    public void insertarPrede() {

        listaPerros.add(new Mascota("Apolo", "Chihuahua", 5, 15));
        listaPerros.add(new Mascota("Zeus", "Labrador", 8, 56));
        listaPerros.add(new Mascota("Rockie", "Pincher", 5, 25));
        listaPerros.add(new Mascota("Peluche", "Dalmata", 10, 61));
        listaPerros.add(new Mascota("Mike", "Sabueso", 11, 35));

        listaPersonas.add(new Persona("Juan"));
        listaPersonas.add(new Persona("Jonatan"));
        listaPersonas.add(new Persona("Ana"));
        listaPersonas.add(new Persona("Debora"));
        listaPersonas.add(new Persona("Elias"));

    }

    public void adopcion() {
        System.out.println("Ingrese su Nombre: ");
        String nom = leer.next();
        int n = 0;

        Iterator<Persona> iteratorP = listaPersonas.iterator();
        Iterator<Mascota> iteratorM = listaPerros.iterator();
        while (iteratorP.hasNext()) {
            Persona aux = iteratorP.next();
            if (nom.equalsIgnoreCase(aux.getNombre())) {
                System.out.println("Hola " + aux.getNombre() + " ¿Que perro desea adoptar? ");
                System.out.print("Ingrese el nombre de la Mascota: ");
                String nomP = leer.next();
                System.out.print("Ingrese la raza de la Mascota: ");
                String raza = leer.next();
                n=1;

                while (iteratorM.hasNext()) {
                    Mascota auxM = iteratorM.next();
                    if (nomP.equalsIgnoreCase(auxM.getNombre()) && raza.equalsIgnoreCase(auxM.getRaza())) {
                        adopciones.add(new Persona(aux.getNombre(), auxM));
                        iteratorP.remove();
                        iteratorM.remove();
                        System.out.println(aux.getNombre() + " ha adoptado a una " + auxM + "\n\n");
                        break;

                    }
                }
            }
        }
        if(n == 0){
            System.out.println(nom.toUpperCase() + " No se encuentra en el registro de compradores.....\n\n");   
        }
        else if(n == 1){
            System.out.println(nom.toUpperCase() + " Esta Mascota no se encuentra Disponible para la adopcion.....\n\n");    
        }
    }

    public void mostrarAdopciones() {
        System.out.println("Adopciones: ");
        adopciones.forEach((x) -> System.out.println(x));
    }
}