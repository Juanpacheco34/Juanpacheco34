/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicamain;

import matematicaClass.matematicaClass;
import matematicaService.matematicaService;

/**
 * 
 * @author jpach
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matematicaService ms = new matematicaService();
        matematicaClass matematica= ms.insert();
        
        System.out.println("El valor mayor es: " + ms.devolverMayor(matematica));
        System.out.println("El valor maryor elevado a la potencia con el valor menor es: " + ms.calcularPotencia(matematica));
        System.out.println("La raiz cuadrada del valor menor es: " + ms.calcularRaiz(matematica));
        
        System.out.println("\n\n\n");
        System.out.println("num1: " + matematica.getNum1());
        System.out.println("num2: " + matematica.getNum2());
        
    }
    
}
