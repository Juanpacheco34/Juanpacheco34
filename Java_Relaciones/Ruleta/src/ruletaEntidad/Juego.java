/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletaEntidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver
 *
 * @author jpach
 */
public class Juego {

    private final Scanner leer = new Scanner(System.in);

    private final List<Jugador> listaJugadores = new ArrayList();;
    private final Revolver revolver = new Revolver();
    private final Jugador jugadores = new Jugador();;

    public void llenarJuego() {
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//  y el revolver para guardarlos en los atributos del juego.

        System.out.print("Cuantos Jugadores participan:");
        int num = leer.nextInt();
        if(num < 0 || num > 6){
            System.out.println("Solo 6 participantes....");
        }
        else if (num == 0) {
            for (int i = 0; i < 6; i++) {
                this.listaJugadores.add(new Jugador("Player ", (i + 1)));

            }
        } else {
            for (int i = 0; i < num; i++) {
                this.listaJugadores.add(new Jugador("Player ", (i + 1)));
            }

        }
 

    }

    public void ronda() {
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//  aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//  moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//  mojar. Al final del juego, se debe mostrar que jugador se mojó.
//  Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
        llenarJuego();
        revolver.llenarRevolver();

        for (Jugador aux : listaJugadores) {
            aux.setMojado(revolver.getPosicionActual() == revolver.getPosicionAgua());
            jugadores.disparo(revolver);
            if (aux.getMojado() == true) {
                System.out.println("\n\n\n");
                System.out.println(aux.toString());
                System.out.println("\t\tGame Over\n\n\n");
                break;
            }

        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
}



//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.
