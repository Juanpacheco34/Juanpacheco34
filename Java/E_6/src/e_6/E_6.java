package e_6;

import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class E_6 {

    /**
     * Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un valor: ");
        int num = leer.nextInt();
        
        if(num == 0){
            System.out.println("Ingresa otro valor diferente de \"0\"");
            
        }else if(num % 2 == 0){
            System.out.println("Tu valor es " + num + " es par");
            
        } else if (num % 2 == 1) {
            System.out.println("Tu valor es " + num + " es impar");
        }
    }
    
}
