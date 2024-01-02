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
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        personaService ps = new personaService();
        personaClass[] persona = new personaClass[1];
        int pb = 0, pi = 0, sp = 0, me = 0, m = 0;

        for (int i = 0; i < persona.length; i++) {

            System.out.println("Alumno " + (i + 1));

            persona[i] = ps.crearPersona();
            System.out.println(ps.calcularIMC(persona[i]));

            int imc = (int) ps.calcularIMC(persona[i]);
            switch (imc) {
                case -1:
                    pb++;
                    break;
                case 0:
                    pi++;
                    break;
                default:
                    sp++;
                    break;
            }
            boolean mayor = ps.esMayorDeEdad(persona[i]);
            if (mayor == true) {
                me++;
            } else {
                m++;
            }
        }

        System.out.println("hay un total de " + pb + " por debajo del peso ideal");
        System.out.println("hay un total de " + pi + " en su peso ideal");
        System.out.println("hay un total de " + sp + " con sobrepeso");
        System.out.println("hay un total de " + me + " mayores de edad");
        System.out.println("hay un total de " + m + " menores de edad");

    }

}
