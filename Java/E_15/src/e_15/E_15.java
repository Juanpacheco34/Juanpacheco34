package e_15;

import java.util.Scanner;

public class E_15 {

    /**
     * . Realizar un algoritmo que rellene un vector con los 100 primeros
     * números enteros y los muestre por pantalla en orden descendente.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 100;
        int vect[] = new int[c];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = i + 1;
        }
        for (int j = c - 1; j >= 0; j--) {
            System.out.println(vect[j] + ", ");
        }

    }

}
