package e_13;

import java.util.Scanner;

public class E_13 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente:
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el valor de tu elemento: ");
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) { //Vertical "Altura"
            for (int j = 0; j < n; j++) { //Horizontal "Base"
                if (i == 0 || i == n) {
                    System.out.print("*");
                } else if (j == 0 || j == n - 1) {
                    System.out.print("*");

                } else if (i == n -1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");

        }
    }

}

