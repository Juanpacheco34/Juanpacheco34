package libro.servicios;
import libro.entidades.libro;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class crearLibro {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public libro crearLibro(){
        System.out.println("Ingrese los datos del libro que Busca\n");
        System.out.println("Introducir ISBN");
        int isbn = leer.nextInt();
        System.out.println("Introducir Titulo");
        String titulo = leer.next();
        System.out.println("Introducir Autor");
        String autor = leer.next();
        System.out.println("Introducir Numero de Paginas");
        int n_pagina = leer.nextInt();
        
        return new libro(isbn,titulo,autor,n_pagina);
    }
    
    
    
}
