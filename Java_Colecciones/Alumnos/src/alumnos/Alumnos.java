/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import alumnosService.alumnosService;

/**
 *
 * @author jpach
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alumnosService as = new alumnosService();
        
        as.CrearAlumnos();
        as.notaFinal();
    }
    
}
