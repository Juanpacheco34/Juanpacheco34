package raices;

import raicesClass.RaicesClass;
import raicesService.RaicesService;

/**
 *
 * @author jpach
 */
public class Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesService rs = new RaicesService();
        RaicesClass rc = rs.insert();
        
        rs.getDiscriminante(rc);
        
        System.out.println("");
        System.out.println("Tiene 1 solucion: " + rs.tieneRaiz(rc));
        System.out.println("Tiene 2 soluciones: " + rs.tieneRaices(rc));
        
        rs.obtenerRaices(rc);
        
        rs.obtenerRaiz(rc);
    }
    
}
