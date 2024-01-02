package cine;

import cineService.cineService;

public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cineService cs = new cineService();
        
        cs.insert();
        cs.peliMayor1Hora();
        cs.peliMayorMenor();
        cs.peliMenorMayor();
        cs.peliOrdenadaTitulo();
        cs.peliOrdenadaDirector();
        
     
    }
    
}
