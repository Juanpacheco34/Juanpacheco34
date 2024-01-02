package e_1;

import java.util.Scanner;

public class E_1 {

    /*
     Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
     dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores a Sumar: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("");
        System.out.println("El resultado de tu suma es: " + (num1 + num2));

    }

}
