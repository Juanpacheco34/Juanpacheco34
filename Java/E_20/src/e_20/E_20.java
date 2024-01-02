package e_20;

import java.util.Scanner;

public class E_20 {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int fila = 3, columnas = 3;
        boolean bolean,bolean1;

        int matriz[][] = new int[fila][columnas];
        System.out.println("Rellena la matriz 3x3");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();

            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        System.out.println(suma1(matriz));
        System.out.println("");
        System.out.println(suma2(matriz));
        System.out.println("");
        System.out.println(suma3(matriz));
        System.out.println("");
        System.out.println(suma4(matriz));

        bolean = suma1(matriz) == suma2(matriz);
        bolean1 = suma3(matriz) == suma4(matriz);
        System.out.println("");
        System.out.println("");

        if (bolean == true && bolean1 == true) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }

    }

    public static int suma1(int matriz[][]) {
        int suma;
        suma = matriz[0][0];
        suma += matriz[0][1];
        suma += matriz[0][2];

        return suma;

    }

    public static int suma2(int matriz[][]) {
        int suma;
        suma = matriz[1][0];
        suma += matriz[1][1];
        suma += matriz[1][2];

        return suma;

    }

    public static int suma3(int matriz[][]) {
        int suma;
        suma = matriz[2][0];
        suma += matriz[2][1];
        suma += matriz[2][2];

        return suma;

    }

    public static int suma4(int matriz[][]) {
        int suma;
        suma = matriz[0][0];
        suma += matriz[1][1];
        suma += matriz[2][2];

        return suma;

    }

}
