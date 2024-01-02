package e_7;

import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class E_7 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
     * Incorrecto. Nota: investigar la función equals() en Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la frase \"eureka\"");
        String f = leer.next();
        
        if (f.equals("eureka")) {
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
        }

    }

}
