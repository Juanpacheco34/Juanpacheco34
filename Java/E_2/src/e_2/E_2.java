
package e_2;
import java.util.Scanner;


public class E_2 {

    /*
     Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
     pantalla.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nom = leer.nextLine();
        System.out.println("Tu Nombre es: " + nom);
    }
    
}
