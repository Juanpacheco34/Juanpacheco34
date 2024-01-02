package nif;

import nifClass.NIFClass;
import nifService.NIFService;

/**
 *
 * @author jpach
 */
public class NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService ns =new  NIFService();
        NIFClass nc = ns.insert();
        
        
        
        ns.mostrar(nc);
    }
    
}
