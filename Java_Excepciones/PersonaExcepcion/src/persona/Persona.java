/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import persona.entidades.personaClass;
import persona.service.personaService;

/**
 *
 * @author jpach
 */
public class Persona {

    /**
     * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
     * Servicios, a null y tratar de invocar el método esMayorDeEdad() a
     * través de ese objeto. Luego, englobe el código con una cláusula
     * try-catch para probar la nueva excepción que debe ser controlada.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        personaService ps = new personaService();

        try {
            personaClass persona = null;
            ps.esMayorDeEdad(persona);

        } catch (Exception e) {
            System.out.println("Datos no validos");
        }
    }

}
