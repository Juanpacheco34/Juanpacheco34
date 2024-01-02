package tienda;

import tiendaService.tiendaService;

/**
 *
 * @author jpach
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tiendaService ts = new tiendaService();
        
        ts.insertproductos();
        ts.modificarPrecio();
        ts.eliminarProducto();
    }
    
}
