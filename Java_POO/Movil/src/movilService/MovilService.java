package movilService;

import java.util.Scanner;
import movilClass.MovilClass;

/**
 * Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo 
 * @author jpach
 */
public class MovilService {
    Scanner leer = new Scanner(System.in);
    
    public MovilClass cargarCelular(){
        MovilClass movil = new MovilClass();
        System.out.println("Ingresa la marca del Celular: ");
        movil.setMarca(leer.next());
        System.out.print("Ingresa el precio: ");
        movil.setPrecio(leer.nextDouble());
        System.out.print("Ingresa el modelo: ");
        movil.setModelo(leer.next());
        System.out.print("Ingresa la capacidad de la memoria ram: ");
        movil.setMemoriRam(leer.nextInt());
        System.out.print("Ingresa la cantidad de almacenamiento: ");
       movil.setAlmacenamiento(leer.nextInt());
       ingresaCodigo(movil);
       
       return movil;
        
    }
    
    public void ingresaCodigo(MovilClass movil){
        int vector[] = new int [movil.getCodigo().length];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el codigo " + (i+1));
            vector[i] = leer.nextInt();
            
        }
    }
    
}
