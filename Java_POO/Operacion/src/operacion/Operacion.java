/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import operacion.entidad.operacion;
import operacion.servicio.servicioOperacion;


/**
 *
 * @author jpach
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioOperacion instancia = new servicioOperacion();
        operacion operacion = instancia.crearOperacion();
        
        System.out.println("\nEl resultado de tu suma es: " + operacion.suma());
        System.out.println("El resultado de tu resta es: " + operacion.resta());
        System.out.println("El resultado de tu multiplicacion es: " + operacion.multiplicar());
        System.out.println("El resultado de tu division es: " + operacion.dividir());

    }
    
}
