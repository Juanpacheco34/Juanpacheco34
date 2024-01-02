/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesor;

import profesorClass.ProfesorClass;
import profesorService.ProfesorService;

/**
 *
 * @author jpach
 */
public class Profesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorService ps = new ProfesorService();
        ProfesorClass pc = new ProfesorClass();
        
        ps.CrearCurso(pc);
       
        ps.calcularGananciaSemanal(pc);
        
        
        
    }
    
}
