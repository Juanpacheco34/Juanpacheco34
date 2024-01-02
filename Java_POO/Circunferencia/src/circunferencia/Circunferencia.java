/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import circunferencia.entidades.Calculo;
import static circunferencia.entidades.Calculo.crearCircunferencia;


/**
 *
 * @author jpach
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculo radio = new Calculo(0);
        radio.setRadio(crearCircunferencia());
        
        System.out.println("Tu radio es: " + radio.getRadio());
        System.out.println("Tu area es: " + radio.area());
        System.out.println("Tu perimetro es: " + radio.perimetro());

    }
}