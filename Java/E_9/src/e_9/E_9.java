package e_9;

import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class E_9 {

    /**
     * Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
     * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
     * Substring y equals() de Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingresa una frase que comience con \"A\"");
        String f = leer.nextLine();
        
        if (f.substring(0,1).equals("A")) {
            System.out.println("Correcto");
            
        }else{
            System.out.println("Incorrecto");
        }
    }

}
