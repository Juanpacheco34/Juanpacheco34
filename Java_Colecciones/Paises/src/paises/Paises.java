package paises;

import paisesService.paisesService;

/**
 *
 * @author jpach
 */
public class Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        paisesService ps = new paisesService();
        
        ps.insertPaises();
        ps.ordenarPaises();
        ps.eliminarPaises();
    }
    
}
