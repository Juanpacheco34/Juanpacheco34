
package personasService;

import java.util.Date;
import java.util.Scanner;
import personasClass.PersonasClass;

/**
 

 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario. 
 Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior. 
 * @author jpach
 */
public class PersonasService {
    Scanner leer = new Scanner(System.in);
    public PersonasClass crearPersona(){
        System.out.println("Ingresa tu Nombre: ");
        String nombre = leer.next();
        System.out.println("Ingresa tu fecha de nacimiento: ");
        System.out.println("Ingresa el Dia");
        int dia = leer.nextInt();
        System.out.println("Ingresa el Mes");
        int mes = leer.nextInt();
        System.out.println("Ingresa el Año");
        int anio = leer.nextInt();
        Date fecha =  new Date(anio-1900,mes-1,dia);
        Date fechaNacimiento = fecha;
        
        return new PersonasClass(nombre,fechaNacimiento);
    }

public void calcularEdad(PersonasClass crearPersona){
    Date hoy = new Date();
    int edad = hoy.getYear() - crearPersona.getFechaNacimiento().getYear();
    
    System.out.println("Tu edad es de " + edad + " Años");

}

public void menorQ(PersonasClass crearPersona){
     System.out.println("Ingresa el nombre de un familiar o amigo\n para comparar si eres el Menor o Mayor: ");
        String nombre = leer.next();
        System.out.println("Ingresa tu fecha de nacimiento: ");
        System.out.println("Ingresa el Dia");
        int dia = leer.nextInt();
        System.out.println("Ingresa el Mes");
        int mes = leer.nextInt();
        System.out.println("Ingresa el Año");
        int anio = leer.nextInt();
        Date fecha =  new Date(anio-1900,mes-1,dia);
        
        boolean bolean = crearPersona.getFechaNacimiento().getYear() > fecha.getYear();
        
        if(bolean == false){
            System.out.println("¿Eres el menor:? " + bolean);
            
        }else{
            
            System.out.println("¿Eres el menor:? " + bolean);
        }
}


}