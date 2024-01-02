/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adopcionextra;

import adopcionextra.Entidad.Adopcion;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class AdopcionExtra {

    /**
     * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
     * Nuestro programa va a tener que contar con muchas personas y muchos
     * perros. El programa deberá preguntarle a cada persona, que perro según su
     * nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, si
     * la persona eligió un perro que ya estaba adoptado, se le debe informar a
     * la persona. Una vez que la Persona elige el Perro se le asigna, al final
     * deberemos mostrar todas las personas con sus respectivos perros.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Adopcion adop = new Adopcion();
        adop.insertarPrede();
        int num;
            System.out.println("\tBienvenido a la tienda de Mascotas");
            System.out.println("Si no esta registrado no puede realizar la compra de la Mascota...\n\n");

        do {
            System.out.println("\tMenu:");
            System.out.println("\t1. Registrar Comprador");
            System.out.println("\t2. Comprar");
            System.out.println("\t3. Salir");
            System.out.print("\n\nIngrese la opcion requerida: ");
            num = leer.nextInt();

            switch (num) {
                case 1:
                    adop.insertarManu();
                    break;
                case 2:
                    adop.adopcion();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ingresa una opcion Correcta.....");
                    break;

            }
        } while (num != 3);{
            System.out.println("");
            adop.mostrarAdopciones();
        }
    }
}
