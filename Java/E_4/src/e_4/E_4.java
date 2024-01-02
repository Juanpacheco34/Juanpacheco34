package e_4;

import java.util.Scanner;

public class E_4 {

    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double c, f;
        
        
        System.out.println("Ingrese grados Celsius a convertir en Fahrenheit: ");
        c = leer.nextDouble();
        f = 32 + (9 * c / 5);
        
        
        System.out.println(c + "°c Convertidos a Fahrenheit son: " + f + "°f");
        

    }

}
