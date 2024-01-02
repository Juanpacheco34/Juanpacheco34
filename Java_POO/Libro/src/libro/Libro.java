package libro;
import libro.entidades.libro;
import libro.servicios.crearLibro;


public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearLibro crearLibro = new crearLibro();
        libro libro = crearLibro.crearLibro();
        
        System.out.println(libro);
        
    }
}
