/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import cadenaClass.cadenaClass;
import cadenaService.cadenaService;

/**
 *
 * @author jpach
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cadenaService cs = new cadenaService();
        cadenaClass cadena = cs.insert();

        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        cs.caracterRepetido(cadena);
        cs.compararLongitud(cadena);
        cs.unirFrase(cadena);
        cs.reemplazarCaracter(cadena);
        cs.contiene(cadena);

    }

}
