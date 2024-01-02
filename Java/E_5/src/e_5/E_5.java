package e_5;

import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class E_5 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por
     * pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un valor: ");
        int num = leer.nextInt();

        System.out.println("El doble de tu valor es: " + (num * 2));
        System.out.println("El triple de tu valor es: " + (num * 3));
        System.out.println("La raiz cuadrada de tu valor es: " + Math.sqrt(num));

    }

}
