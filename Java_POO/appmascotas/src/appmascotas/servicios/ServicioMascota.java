package appmascotas.servicios;
import java.util.Scanner;
import appmascotas.entidades.Mascotas;

/**
 *
 * @author jpach
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascotas crearMascota(){
        
        
        System.out.println("Ingrese los Datos de su perro:\n");
        System.out.println("Intriducir Nombre");
        String nombre = leer.next();
        System.out.println("Intriducir Edad");
        int edad = leer.nextInt();
        System.out.println("Intriducir Color");
        String color = leer.next();
        System.out.println("Intriducir Raza");
        String raza = leer.next();
        System.out.println("Intriducir Cantidad de Estamina");
        int energia = leer.nextInt();
        
       return new Mascotas(nombre,edad, color, raza, energia);
        
    }
    
}
