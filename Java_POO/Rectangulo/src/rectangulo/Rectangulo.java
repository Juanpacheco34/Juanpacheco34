package rectangulo;

import rectangulo.entidades.rectanguloClass;
import rectangulo.servicio.rectanguloServicio;

/**
 *
 * @author jpach
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectanguloServicio rs = new rectanguloServicio();
        rectanguloClass rc = rs.crearRectangulo();
        
        System.out.println("");
        rs.superficie(rc);
        rs.perimetro(rc);
        System.out.println("");
        rs.mostrarRectangulo(rc);
    }
    
}
