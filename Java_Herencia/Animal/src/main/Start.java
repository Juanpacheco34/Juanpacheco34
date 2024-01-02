/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import operaciones.animal;
import operaciones.caballo;
import operaciones.gato;

/**
 *
 * @author jpach
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        animal animales = new animal("Tom", "Pescado", 11, "Felina");
        animales.alimentacion();
        gato G = new gato("Zeus", "Ratones", 11, "Felina");
        G.alimentacion();
        caballo C = new caballo("Spirit", "Pasto", 7, "Pinto");
        C.alimentacion();
    }

}
