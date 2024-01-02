package puntos;

import puntosClass.PuntosClass;
import puntosService.PuntosService;

/**
 *
 * @author jpach
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PuntosService ps = new PuntosService();
       PuntosClass pc = ps.insert();
       
       ps.mostrarDistacia(pc);
    }
    
}
