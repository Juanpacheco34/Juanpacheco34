package e_16;

import java.util.Scanner;

public class E_16 {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un numero a buscar en el vector. El
     * programa mostrará donde se encuentra el numero y si se encuentra repetido
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int b;
        int vect[] = new int[10];

        System.out.println("Ingresa el numero a buscar en el vector");
        b = leer.nextInt();
        System.out.println("");

        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 5);
            System.out.print(vect[i]);
        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            if (b == vect[i]) {
                System.out.println("El numero se encontro en la posicion #" + i);
            } else {

            }

        }

    }

}
