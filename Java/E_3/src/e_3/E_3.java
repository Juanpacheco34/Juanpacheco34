package e_3;

import java.util.Scanner;

public class E_3 {
    /*
     Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
     en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
     Java.
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("");
        System.out.println("Frase Original: " + frase);
        System.out.println("Frase en Mayuscula: ".concat(frase.toUpperCase()));
        System.out.println("Frase en Minuscula: ".concat(frase.toLowerCase()));

    }

}
