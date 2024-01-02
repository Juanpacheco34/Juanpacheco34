/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import personasClass.PersonasClass;
import personasService.PersonasService;

/**
 *
 * @author jpach
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonasService ps = new PersonasService();
        PersonasClass pc = ps.crearPersona();
        
        
        
        ps.calcularEdad(pc);
        ps.menorQ(pc);
        System.out.println(pc.toString());
    }
    
}
