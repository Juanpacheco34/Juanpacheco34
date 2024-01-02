package appmascotas;

import appmascotas.entidades.Mascotas;
import appmascotas.servicios.ServicioMascota;
//import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class Appmascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMascota m = new ServicioMascota();
        Mascotas m1 = m.crearMascota();
        
        System.out.println(m1);

        
        
        
        
        
      //Scanner leer = new Scanner(System.in);
        //Mascotas mascota1 = new Mascotas("Apolo", 5, "Negro", "Chihuahua",1000);
        //mascota1.setNombre("Apolito");
        
      
      // mascota1.pasear(100, 4);
        //System.out.println(mascota1);

        /* //Forma de definir  Atributos Publicos
        mascota1.nombre = "Apolo";
        mascota1.edad = 5;
        mascota1.color = "Negro";
        mascota1.raza = "Chihuahua";
       
        System.out.println("Tu mascota se llama " + mascota1.getNombre() + " tiene " + mascota1.getEdad() + " Años" + " su raza es " + mascota1.getRaza() + " y su pelaje es " + mascota1.getColor() + "...");
        System.out.println("");
       
       
        //Llamada de los atributos desde el Constructor
        Mascotas mascota2 = new Mascotas("Zeus", 20, "Blanco", "Pitbull");
        System.out.println("Tu mascota se llama " + mascota2.getNombre() + " tiene " + mascota2.getEdad() + " Años" + " su raza es " + mascota2.getRaza() + " y su pelaje es " + mascota2.getColor() + "...");
         */
    }

}
