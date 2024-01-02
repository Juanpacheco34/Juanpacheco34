package movil;

import movilClass.MovilClass;
import movilService.MovilService;

/**
 *
 * @author jpach
 */
public class Movil {


    public static void main(String[] args) {
        MovilService ms = new MovilService();
        MovilClass mc = ms.cargarCelular();
        
        
    }
    
}
