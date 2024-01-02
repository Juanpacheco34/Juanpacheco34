/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import operaciones.Circulo;
import operaciones.Rectangulo;
import operaciones.calculosFormas;

/**
 *
 * @author jpach
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Circulo: ");
        calculosFormas c = new Circulo();
        c.calcularArea();
        c.calcularPerimetro();

        System.out.println("\nRectangulo: ");
        calculosFormas r = new Rectangulo();
        r.calcularArea();
        r.calcularPerimetro();

    }

}
