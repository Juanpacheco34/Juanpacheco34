/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancionService;

import cancionClass.CancionClass;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class CancionService {
    Scanner leer = new Scanner(System.in);
    public CancionClass insert(){
        System.out.print("Ingresa el titulo de la cancion: ");
        String titulo = leer.nextLine();
        System.out.print("Ingresa el autor de la cancion: ");
        String autor = leer.nextLine();
        
        return new CancionClass(titulo,autor);
        
    }
    
    public void mostrar(CancionClass insert){
        System.out.println("Titulo: "  + insert.getTitulo());
        System.out.println("Autor: "  + insert.getAutor());
    }
    
}
