/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia;

import guiaEntidades.Usuario;
import guiaEntidades.Dni;
import guiaEntidades.Equipo;
import guiaEntidades.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpach
 */
public class Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Relacion de uno a uno
        Dni dc = new Dni();
        dc.setDni("F343278");
        
        Usuario uc = new Usuario();
        uc.setNombre("Juan");
        uc.setDni(dc);
        System.out.println(uc.getNombre()+ " " + uc.getDni());


//        Relacion de uno a muchos
        Equipo ec = new Equipo();
        Jugador j1 = new Jugador("J", "P", 5);
        Jugador j2 = new Jugador("T", "F", 7);
        Jugador j3 = new Jugador("Y", "M", 4);
        
        List<Jugador> jugadores = new ArrayList();
        jugadores.add(j1); 
        jugadores.add(j2); 
        jugadores.add(j3);
        jugadores.add(new Jugador("P", "A", 1));
        
        
        ec.setEquipo(jugadores);
        jugadores.forEach((x)->System.out.println(x));
        

    }

}
