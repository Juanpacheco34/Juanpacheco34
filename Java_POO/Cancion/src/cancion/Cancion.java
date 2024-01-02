package cancion;

import cancionClass.CancionClass;
import cancionService.CancionService;

/**
 *
 * @author jpach
 */
public class Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancionService cs  = new CancionService();
        CancionClass cc = cs.insert();
        
        
        
        cs.mostrar(cc);
  
    }
    
}
