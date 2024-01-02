package main;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jpach
 */
public class DivisionNumero {

    /**
     * Defina una clase llamada DivisionNumero. En el método main utilice un
     * Scanner para leer dos números en forma de cadena. A continuación, utilice
     * el método parseInt() de la clase Integer, para convertir las cadenas al
     * tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
     * una división con los dos numeros y mostrar el resultado.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                    

        try {

            System.out.print("Ingrese el primer valor: ");
            String n1 = leer.next();
            int n3 = Integer.parseInt(n1);

            System.out.print("Ingrese el segundo valor: ");
            int n2 = leer.nextInt();

            System.out.println("El resultado de la division es: " + (n3 / n2));
        } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
            System.err.println("\nRevisar que los valores esten correctos...\n" + e.fillInStackTrace());
        }

    }

}
