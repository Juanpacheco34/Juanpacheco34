package e_19;

import java.util.Scanner;

public class E_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int v, fila = 3, columnas = 3;
        boolean bolean;

        int matriz[][] = new int[fila][columnas];

        System.out.println("Rellene su matriz");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();

            }

        }

        matrizA(matriz);
        System.out.println("");
        matrizB(matriz);
        System.out.println("");
        matrizC(matriz);
        System.out.println("");

        if (verificarAB(matrizA(matriz), matrizB(matriz)) == true) {
            System.out.println("La matrizA Y matrizB son Simetrica ");

        } else {
            System.out.println("La matrizA Y matrizB son AntiSimetrica ");

            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

        if (verificarAC(matrizA(matriz), matrizC(matriz)) == true) {
            System.out.println("La matrizA Y matrizC son Simetrica ");

        } else {
            System.out.println("La matrizA Y matrizC son AntiSimetrica ");

            System.out.println("");
        }

    }

    public static int[][] matrizA(int matriz[][]) {
        int ma[][] = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ma[i][j] = matriz[i][j];
                System.out.print("[" + ma[i][j] + "]");

            }
            System.out.println("");
        }
        return ma;
    }

    public static int[][] matrizB(int matriz[][]) {
        int mb[][] = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                mb[j][i] = matriz[j][i];
                System.out.print("[" + mb[j][i] + "]");

            }
            System.out.println("");
        }
        return mb;
    }

    public static int[][] matrizC(int matriz[][]) {
        int mc[][] = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                mc[j][i] = -1 * matriz[j][i];
                System.out.print("[" + (mc[j][i]) + "]");

            }
            System.out.println("");
        }
        return mc;
    }

    public static boolean verificarAB(int matrizA[][], int matrizB[][]) {
        boolean bolean;

        bolean = matrizA[0][2] == -1 * matrizB[0][2];

        return bolean;
    }

    public static boolean verificarAC(int matrizA[][], int matrizC[][]) {
        boolean bolean;

        bolean = matrizA[0][2] == -1 * matrizC[0][2];
        return bolean;
    }
}
